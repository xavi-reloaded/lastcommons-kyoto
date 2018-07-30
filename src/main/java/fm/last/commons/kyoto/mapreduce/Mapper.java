/*
 * Copyright 2012 Last.fm
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
package fm.last.commons.kyoto.mapreduce;

import fm.last.commons.kyoto.KyotoException;

public interface Mapper {

  /**
   * Map a record data.
   * 
   * @param key specifies the key.
   * @param value specifies the value.
   * @param a collector to capture mapper output.
   * @throws KyotoException on failure.
   * @note To avoid deadlock, any explicit database operation must not be performed in this method.
   * @see {@link kyotocabinet.MapReduce#map(byte[], byte[])}
   */
  void map(byte[] key, byte[] value, Context context);

}
