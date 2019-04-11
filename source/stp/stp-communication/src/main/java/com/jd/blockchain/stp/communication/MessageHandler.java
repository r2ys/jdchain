/**
 * Copyright: Copyright 2016-2020 JD.COM All Right Reserved
 * FileName: com.jd.blockchain.stp.communication.MessageHandler
 * Author: shaozhuguang
 * Department: Y事业部
 * Date: 2019/4/11 上午10:59
 * Description:
 */
package com.jd.blockchain.stp.communication;

/**
 *
 * @author shaozhuguang
 * @create 2019/4/11
 * @since 1.0.0
 */

public interface MessageHandler {

    void receive(byte[] key, byte[] data, RemoteSession session);
}