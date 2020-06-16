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
package design_patterns.adapter.model;


import design_patterns.adapter.exceptions.CodeMismatchException;
import design_patterns.adapter.exceptions.IncorrectDoorCodeException;

public class SimpleDoor implements Door {

	public static String DEFAULT_DOOR_CODE = "AAFF1299BFA";

	private String code = DEFAULT_DOOR_CODE;

	private boolean open = false;


	@Override
	public void open(String code) throws IncorrectDoorCodeException {
		// try the code
		if (this.code.equals(code)) {
			this.open = true;
		} else {
			throw new IncorrectDoorCodeException();
		}

	}

	@Override
	public void close() {
		this.open = false;

	}


	@Override
	public boolean isOpen() {
		return this.open;
	}


	@Override
	public void changeCode(String oldCode, String newCode, String newCodeConfirmation) throws IncorrectDoorCodeException, CodeMismatchException {

		if (newCode.equals(newCodeConfirmation)) {
			if (oldCode.equals(this.code)) {
				this.code = newCode;
			} else {
				throw new IncorrectDoorCodeException();
			}
		} else {
			throw new CodeMismatchException();
		}

	}

	@Override
	public boolean testCode(String code) {
		return code.equals(this.code);
	}

}
