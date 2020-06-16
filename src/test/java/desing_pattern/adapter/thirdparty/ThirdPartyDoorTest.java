/**
 * Copyright 2011 Joao Miguel Pereira
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package desing_pattern.adapter.thirdparty;


import design_patterns.adapter.thirdparty.ThirdPartyDoor;
import design_patterns.adapter.thirdparty.exceptions.CannotChangeCodeForUnlockedDoor;
import design_patterns.adapter.thirdparty.exceptions.CannotChangeStateOfLockedDoor;
import design_patterns.adapter.thirdparty.exceptions.CannotUnlockDoorException;
import org.junit.jupiter.api.Test;

import static design_patterns.adapter.thirdparty.ThirdPartyDoor.*;
import static org.junit.jupiter.api.Assertions.*;

public class ThirdPartyDoorTest {

	@Test
	// Shoudl not throw any exception
	public void testUnlockDoor() throws CannotUnlockDoorException {
		ThirdPartyDoor door = createThirtPartyDoor();
		door.unlock(getThirdPartyDoorCode());
		assertTrue(door.getLockStatus().equals(LockStatus.UNLOCKED));
	}

	@Test
	public void testUnlockDoorIncorrectCode() throws CannotUnlockDoorException {
		ThirdPartyDoor door = createThirtPartyDoor();
		assertThrows(CannotUnlockDoorException.class,() -> door.unlock("Som code"));
	}
	
	@Test
	public void testLockDoor() throws CannotUnlockDoorException {
		ThirdPartyDoor door = createThirtPartyDoor();
		door.unlock(getThirdPartyDoorCode());
		assertTrue(door.getLockStatus().equals(LockStatus.UNLOCKED));
		//Now lock it
		door.lock();
		assertTrue(door.getLockStatus().equals(LockStatus.LOCKED));
		
	}
	
	@Test
	public void defaultDoorStateShouldBeClosed() {
		ThirdPartyDoor door = createThirtPartyDoor();
		assertEquals(DoorState.CLOSED, door.getState());
	}
	@Test
	public void openDoor() throws CannotUnlockDoorException, CannotChangeStateOfLockedDoor {
		ThirdPartyDoor door = createThirtPartyDoor();
		//Unlock it
		door.unlock(getThirdPartyDoorCode());
		//Now open it
		door.setState(DoorState.OPEN);
		assertEquals(DoorState.OPEN, door.getState());
	}
	
	@Test
	public void cannotOpenLockedDoor() throws CannotChangeStateOfLockedDoor {
		ThirdPartyDoor door = createThirtPartyDoor();
		//Do not unlock it

		assertThrows(CannotChangeStateOfLockedDoor.class,() -> door.setState(DoorState.OPEN));

	}
	
	@Test
	public void changeCode() throws CannotUnlockDoorException, CannotChangeCodeForUnlockedDoor {
		ThirdPartyDoor door = createThirtPartyDoor();
		door.unlock(getThirdPartyDoorCode());
		door.setNewLockCode("Some Code");
		
		//Lock it
		door.lock();
		//Try to unlock it
		door.unlock("Some Code");
	}
	@Test
	public void cannotChangeCodeForLockedDoor() throws CannotChangeCodeForUnlockedDoor {
		ThirdPartyDoor door = createThirtPartyDoor();
		//Do not unlock it
		assertThrows(CannotChangeCodeForUnlockedDoor.class,() -> door.setNewLockCode("123"));
	}


	private String getThirdPartyDoorCode() {
		// TODO Auto-generated method stub
		return DEFAULT_CODE;
	}

	private ThirdPartyDoor createThirtPartyDoor() {
		return new ThirdPartyDoor();
	}

}
