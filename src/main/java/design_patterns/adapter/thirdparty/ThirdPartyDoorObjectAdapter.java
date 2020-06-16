package design_patterns.adapter.thirdparty;


import design_patterns.adapter.exceptions.CodeMismatchException;
import design_patterns.adapter.exceptions.IncorrectDoorCodeException;
import design_patterns.adapter.model.Door;
import design_patterns.adapter.thirdparty.exceptions.CannotChangeCodeForUnlockedDoor;
import design_patterns.adapter.thirdparty.exceptions.CannotChangeStateOfLockedDoor;
import design_patterns.adapter.thirdparty.exceptions.CannotUnlockDoorException;

public class ThirdPartyDoorObjectAdapter implements Door {

    private ThirdPartyDoor thirdPartyDoor = new ThirdPartyDoor();

    @Override
    public void open(String code) throws IncorrectDoorCodeException {
        try {
            thirdPartyDoor.unlock(code);
            thirdPartyDoor.setState(ThirdPartyDoor.DoorState.OPEN);
        } catch (CannotUnlockDoorException e) {
            throw new IncorrectDoorCodeException();
        } catch (CannotChangeStateOfLockedDoor cannotChangeStateOfLockedDoor) {
            cannotChangeStateOfLockedDoor.printStackTrace();
        }
    }

    @Override
    public void close() {
        try {
            thirdPartyDoor.setState(ThirdPartyDoor.DoorState.CLOSED);
        } catch (CannotChangeStateOfLockedDoor cannotChangeStateOfLockedDoor) {
            cannotChangeStateOfLockedDoor.printStackTrace();
        }
    }

    @Override
    public boolean isOpen() {
        ThirdPartyDoor.DoorState state = thirdPartyDoor.getState();
        return state == ThirdPartyDoor.DoorState.OPEN;
    }

    @Override
    public void changeCode(String oldCode, String newCode, String newCodeConfirmation) throws IncorrectDoorCodeException, CodeMismatchException {
        if (!newCode.equals(newCodeConfirmation)) throw new CodeMismatchException();

        try {
            thirdPartyDoor.unlock(oldCode);
        } catch (CannotUnlockDoorException e) {
            throw new IncorrectDoorCodeException();
        }

        try {
            thirdPartyDoor.setNewLockCode(newCode);
        } catch (CannotChangeCodeForUnlockedDoor cannotChangeCodeForUnlockedDoor) {
            cannotChangeCodeForUnlockedDoor.printStackTrace();
        }
    }

    @Override
    public boolean testCode(String code) {
        try {
            thirdPartyDoor.unlock(code);
            thirdPartyDoor.lock();
            return true;
        } catch (CannotUnlockDoorException e) {
            return false;
        }

    }
}
