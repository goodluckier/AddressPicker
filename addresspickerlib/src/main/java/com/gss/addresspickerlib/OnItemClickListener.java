package com.gss.addresspickerlib;

/**
 * Created by 郭守帅 on 2018/8/21
 */

public interface OnItemClickListener {
    /**
     * @param name 返回地址列表对应点击的对象
     * @param tabPosition 对应tab的位置
     * */
    void onItemClick(AddressSelector addressSelector,NameInterface name, int tabPosition);
}
