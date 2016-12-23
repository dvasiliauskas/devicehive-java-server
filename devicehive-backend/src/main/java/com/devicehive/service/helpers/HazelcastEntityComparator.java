package com.devicehive.service.helpers;

/*
 * #%L
 * DeviceHive Java Server Common business logic
 * %%
 * Copyright (C) 2016 DataArt
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.devicehive.model.HazelcastEntity;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;

public class HazelcastEntityComparator implements Comparator<Map.Entry>, Serializable {
    private static final long serialVersionUID = 5413354955792888308L;

    @Override
    public int compare(Map.Entry o1, Map.Entry o2) {
        final Date o1Time = ((HazelcastEntity) o1.getValue()).getTimestamp();
        final Date o2Time = ((HazelcastEntity) o2.getValue()).getTimestamp();

        return o1Time.compareTo(o2Time);
    }
}
