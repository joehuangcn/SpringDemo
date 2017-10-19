//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by lenovo on 2017/9/27.
// */
//
//public class test {
//    //生产FTP的表头信息
//    public static List<String[]> columnNameFtp(){
//        List<String[]> columNames = new ArrayList<String[]>();
//        String[] extraColumns = new String[]{"协议代码","动作类型","主实体文件名","主实体文件大小","主实体文件的MD5",
//                "辅助实体文件","辅助实体文件MD5"};
//        String[] finalColumns = (String[]) ArrayUtils.addAll(columns,extraColumns);
//        columNames.add(finalColumns);
//        return columNames;
//    }
//
//    //生产FTP的表头对应的字段信息，用于反射读取值
//    public  static  List<String[]> fieldFtp(){
//        List<String[]> fieldNames = new ArrayList<String[]>();
//
//        String[] extraFields = new String[]{"ftpType","action","mainFile","fileSize","fileMd5",
//                "otherFile","otherFileMd5"};
//        String[] fields = (String[]) ArrayUtils.addAll(tempFields,extraFields);
//        fieldNames.add(fields);
//        return fieldNames;
//    }
//
//
//    public static List<String[]> columnNameMearAndGroupBuy(){
//        List<String[]> columNames = new ArrayList<String[]>();
//        String[] extraColumns = new String[]{"协议代码","网络应用代码","真名","手机号","主机HOST",
//                "前端设备ID","入库时间","用户昵称","定购内容关键词","所在地"};
//        String[] finalColumns = (String[]) ArrayUtils.addAll(columns,extraColumns);
//        columNames.add(finalColumns);
//        return columNames;
//    }
//
//    public  static  List<String[]> fieldMearAndGroupBuy(){
//        List<String[]> fieldNames = new ArrayList<String[]>();
//
//        String[] extraFields = new String[]{"mearandGroupBuyType","serviceProvider","trueName","mobile","website",
//                "deviceId","impTime","nickname","keyword","location"};
//        String[] fields = (String[]) ArrayUtils.addAll(tempFields,extraFields);
//        fieldNames.add(fields);
//        return fieldNames;
//    }
//
//    public static List<String[]> columnNameMapAndTexi(){
//        List<String[]> columNames = new ArrayList<String[]>();
//        String[] extraColumns = new String[]{"协议代码","网络应用代码","手机号","主机HOST",
//                "前端设备ID","入库时间","用户昵称","关键词","目的地","所在地"};
//        String[] finalColumns = (String[]) ArrayUtils.addAll(columns,extraColumns);
//        columNames.add(finalColumns);
//        return columNames;
//    }
//
//
//    public  static  List<String[]> fieldMapAndTexi(){
//        List<String[]> fieldNames = new ArrayList<String[]>();
//
//        String[] extraFields = new String[]{"travelOrderType","serviceProvider","mobile","website",
//                "deviceId","impTime","nickname","keyword","desAddrs","location"};
//        String[] fields = (String[]) ArrayUtils.addAll(tempFields,extraFields);
//        fieldNames.add(fields);
//        return fieldNames;
//    }
//
//    public static List<String[]> columnNameRecruit() {
//        List<String[]> columNames = new ArrayList<String[]>();
//        String[] extraColumns = new String[]{"协议代码","网络应用代码","注册账号","简历姓名",
//                "简历性别","简历证件类型","简历证件编号","简历手机号","简历联系地址","意向城市","联系用账号","前端设备ID","入库时间"};
//        String[] finalColumns = (String[]) ArrayUtils.addAll(columns,extraColumns);
//        columNames.add(finalColumns);
//        return columNames;
//    }
//
//    public  static  List<String[]> fieldRecruit(){
//        List<String[]> fieldNames = new ArrayList<String[]>();
//
//        String[] extraFields = new String[]{"recruitType","serviceProvider","regAccount","resumeName",
//                "resumeSex","resumeCertificateType","resumeCertificateCode","resumeMobile","resumeAddress","resumeCity",
//                 "contactAccount","deviceId","impTime"};
//        String[] fields = (String[]) ArrayUtils.addAll(tempFields,extraFields);
//        fieldNames.add(fields);
//        return fieldNames;
//    }
//
//
//    public static List<String[]> columnNameDelivery() {
//        List<String[]> columNames = new ArrayList<String[]>();
//        String[] extraColumns = new String[]{"协议代码","网络应用代码","寄件者名称","寄件者手机号码",
//                "寄件者详细地址","收件者名称","收件者手机号码","收件者详细地址","寄件订单号",
//                "寄件物品名称","寄件物品的数量","下单时间","订单备注","主实体文件","主实体文件大小","主实体文件的MD5",
//                "辅助实体文件列表","辅助实体文件MD5","站点","订单备注","前端设备ID","入库时间" };
//        String[] finalColumns = (String[]) ArrayUtils.addAll(columns,extraColumns);
//        columNames.add(finalColumns);
//        return columNames;
//    }
//
//    public  static  List<String[]> fieldDelivery(){
//        List<String[]> fieldNames = new ArrayList<String[]>();
//
//        String[] extraFields = new String[]{"deliveryType","serviceProvider","sender","senderPhone",
//                "senderAddress","receiver","receiverPhone","receiverAddress","orderNum","goods",
//                "goodsNum","orderTime","mainFile","fileSize","fileMD5","otherFile","otherFileMD5",
//                 "website","remark","deviceId","impTime"};
//        String[] fields = (String[]) ArrayUtils.addAll(tempFields,extraFields);
//        fieldNames.add(fields);
//        return fieldNames;
//    }
//
//    public static List<String[]> columnNameTravelOrder() {
//        List<String[]> columNames = new ArrayList<String[]>();
//        String[] extraColumns = new String[]{"协议代码","网络应用代码","用户真名","手机号",
//                "证件类别","证件号码","联系用帐号类型","联系用帐号","酒店名字",
//                "所在城市行政区划","酒店地址","房间数目","入住时间","离开时间","站点","联系人姓名",
//                "联系人单子邮箱","前端设备ID","入库时间","关键词","目的地","所在地","出发时间","返回时间","客户端ID",
//                "客户端IP"};
//        String[] finalColumns = (String[]) ArrayUtils.addAll(columns,extraColumns);
//        columNames.add(finalColumns);
//        return columNames;
//    }
//
//    public  static  List<String[]> fieldTravelOrder(){
//        List<String[]> fieldNames = new ArrayList<String[]>();
//
//        String[] extraFields = new String[]{"travelOrderType","serviceProvider","name","mobile",
//                "pickupCertificateType","pickupCertificateCode","contactAccountType","contactAccount","hotelName","inCity",
//                "hotelAddress","roomCount","chinTime","choutTime","website","relationshipName","relationshipMobilePhone",
//                "relationshipEmail","deviceId","impTime","keyword","desAddrs","location","goTime","returnTime",
//                "clientId","clientIp"};
//        String[] fields = (String[]) ArrayUtils.addAll(tempFields,extraFields);
//        fieldNames.add(fields);
//        return fieldNames;
//    }
//
//    public static List<String[]> columnNameShop() {
//        List<String[]> columNames = new ArrayList<String[]>();
//        String[] extraColumns = new String[]{"协议代码","网络应用代码","URL","域名",
//                "购买者账号","购买者昵称","卖家ID号","卖家昵称","订单号或物品ID",
//                "购买物品名称","购买者填写的电话号码","购买的数量","物品金额","下单时间","物品金额","下单时间",
//                "购买者指定的接货时间","购买者联系用帐号类型","联系用帐号","购物者留言","个人资料中的用户名称",
//                "个人资料中的手机号","个人资料的证件类型","个人资料中的证件号码","个人资料注册用帐号类型",
//                "个人资料中的注册用账号","用户支付用帐号类型","用户支付用帐号","收货人姓名","主实体文件","主实体文件大小",
//               "主实体文件的MD5","辅助实体文件列表","辅助实体文件MD5","前端设备ID","入库时间","联系人姓名",
//               "联系人手机号码","联系人电子邮箱"};
//        String[] finalColumns = (String[]) ArrayUtils.addAll(columns,extraColumns);
//        columNames.add(finalColumns);
//        return columNames;
//    }
//
//    public  static  List<String[]> fieldShop(){
//        List<String[]> fieldNames = new ArrayList<String[]>();
//
//        String[] extraFields = new String[]{"shopType","serviceProvider","url","domain",
//                "buyAccount","buyNickname","sellAccount","sellNickname","orderNum","goodsName",
//                "buyPhone","buyCount","money","buyTime","addressTime","address","contactAccountType",
//                "contactAccount","leaveWord","name","mobile","pickupCertificateType","pickupCertificateCode","regAccountType","regAccount",
//                "payAccountType","payAccount","receiverName","mainFile","fileSize","fileMd5","otherFile","otherFileMd5",
//                "deviceId","impTime","relationshipName","relationshipMobilePhone","relationshipEmail"};
//        String[] fields = (String[]) ArrayUtils.addAll(tempFields,extraFields);
//        fieldNames.add(fields);
//        return fieldNames;
//    }
//
//}
