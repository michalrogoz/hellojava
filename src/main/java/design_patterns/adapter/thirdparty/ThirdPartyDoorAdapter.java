package design_patterns.adapter.thirdparty;


import design_patterns.adapter.exceptions.CodeMismatchException;
import design_patterns.adapter.exceptions.IncorrectDoorCodeException;
import design_patterns.adapter.model.Door;
import design_patterns.adapter.thirdparty.exceptions.CannotChangeCodeForUnlockedDoor;
import design_patterns.adapter.thirdparty.exceptions.CannotChangeStateOfLockedDoor;
import design_patterns.adapter.thirdparty.exceptions.CannotUnlockDoorException;

public class ThirdPartyDoorAdapter extends ThirdPartyDoor implements Door {

    @Override
    public void open(String code) throws IncorrectDoorCodeException {
        try {
            super.unlock(code);
            super.setState(DoorState.OPEN);
        } catch (CannotUnlockDoorException e) {
            throw new IncorrectDoorCodeException();
        } catch (CannotChangeStateOfLockedDoor cannotChangeStateOfLockedDoor) {
            cannotChangeStateOfLockedDoor.printStackTrace();
        }
    }

    @Override
    public void close() {
        try {
            super.setState(DoorState.CLOSED);
        } catch (CannotChangeStateOfLockedDoor cannotChangeStateOfLockedDoor) {
            cannotChangeStateOfLockedDoor.printStackTrace();
        }
    }

    @Override
    public boolean isOpen() {
        DoorState state = super.getState();
        return state == DoorState.OPEN;
    }

    @Override
    public void changeCode(String oldCode, String newCode, String newCodeConfirmation) throws IncorrectDoorCodeException, CodeMismatchException {
        if (!newCode.equals(newCodeConfirmation)) throw new CodeMismatchException();

        try {
            super.unlock(oldCode);
        } catch (CannotUnlockDoorException e) {
            throw new IncorrectDoorCodeException();
        }

        try {
            super.setNewLockCode(newCode);
        } catch (CannotChangeCodeForUnlockedDoor cannotChangeCodeForUnlockedDoor) {
            cannotChangeCodeForUnlockedDoor.printStackTrace();
        }
    }

    @Override
    public boolean testCode(String code) {
        try {
            super.unlock(code);
            super.lock();
            return true;
        } catch (CannotUnlockDoorException e) {
            return false;
        }
    }
}
