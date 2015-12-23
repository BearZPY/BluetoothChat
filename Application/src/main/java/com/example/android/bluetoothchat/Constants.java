/*
 * Copyright (C) 2014 The Android Open Source Project
 *
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
 */

package com.example.android.bluetoothchat;

/**
 * Defines several constants used between {@link BluetoothChatService} and the UI.
 */
public interface Constants {

    // Message types sent from the BluetoothChatService Handler
    // 从BluetoothChatService传回来交给Handler处理的消息类型\

    // 蓝牙socket状态改变，有4个状态  监听、正在连接、已连接、无
    public static final int MESSAGE_STATE_CHANGE = 1;
    // 蓝牙服务socket在读别的设备发来的内容
    public static final int MESSAGE_READ = 2;
    // 蓝牙socket正在写要发送的内容
    public static final int MESSAGE_WRITE = 3;
    // 蓝牙连接了一个设备且获得了设备名字
    public static final int MESSAGE_DEVICE_NAME = 4;
    // 有需要用Toast控件广播的内容
    public static final int MESSAGE_TOAST = 5;



    // Key names received from the BluetoothChatService Handler
    // 从BluetoothChatService 的发送回来消息内容里的键值

    // 获取设备名时的键值
    public static final String DEVICE_NAME = "device_name";
    // 获取广播内容的键值
    public static final String TOAST = "toast";

}
