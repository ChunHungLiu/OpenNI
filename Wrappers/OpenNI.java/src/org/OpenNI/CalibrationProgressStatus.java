/*****************************************************************************
*                                                                            *
*  OpenNI 1.x Alpha                                                          *
*  Copyright (C) 2012 PrimeSense Ltd.                                        *
*                                                                            *
*  This file is part of OpenNI.                                              *
*                                                                            *
*  Licensed under the Apache License, Version 2.0 (the "License");           *
*  you may not use this file except in compliance with the License.          *
*  You may obtain a copy of the License at                                   *
*                                                                            *
*      http://www.apache.org/licenses/LICENSE-2.0                            *
*                                                                            *
*  Unless required by applicable law or agreed to in writing, software       *
*  distributed under the License is distributed on an "AS IS" BASIS,         *
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  *
*  See the License for the specific language governing permissions and       *
*  limitations under the License.                                            *
*                                                                            *
*****************************************************************************/
package org.openni;

import java.util.NoSuchElementException;

/**
 * Provides string names for all possible skeleton calibration state codes. <BR><BR>
 *
 */
public enum CalibrationProgressStatus
{
	OK(0),
	NO_USER(1),
	ARM(2),
	LEG(3),
	HEAD(4),
	TORSO(5),
	TOP_FOV(6),
	SIDE_FOV(7),
	POSE(8),
	MANUAL_ABORT(9),
	MANUAL_RESET(10),
	TIMEOUT_FAIL(11);

	
	CalibrationProgressStatus(int val)
	{
		this.val = val;
	}
	
	public int toNative() { return this.val; }
	
	public static CalibrationProgressStatus fromNative(int value)
	{
		for (CalibrationProgressStatus type : CalibrationProgressStatus.values()) 
		{
			if (type.val == value)
				return type;
		}
		
		throw new NoSuchElementException();
	}
	
	private final int val;



}
