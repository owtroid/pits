/*
 * Copyright (C) 2015 Pivotal Software, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.owtroid.pits.sensors;

import java.util.List;

/**
 *
 * @author Torgny Johansson <owtroid@gmail.com>
 * @param <T>
 */
public interface Sensor<T> {
    
    public String getId();
    
    public String getDescription();
    
    public String getName();
    
    public SensorValue<T> getLastValue();
    
    public List<SensorValue<T>> getValues();
    
    public void addValue(SensorValue<T> value);
}
