package com.travel.travel;

import java.util.List;

public class GetTravelSuccess {

    /**
     * reason : success
     * result : {"list":[{"name":"虎丘","content":"   被誉为\u201c吴中第一名胜\u201d的虎丘，又名海涌山、海涌峰、虎阜，位于苏州古城西北，距阊门3.5公里的郊外。 虎丘海拔34.3米，占地约20公顷，山体为距今一亿五千万年的中生代侏罗纪时代喷发的岩浆凝结而成的流纹岩。<br>远古时代，虎丘曾是海湾中的一座随着海潮时隐时现的小岛，历经沧海桑田的变迁，最终从海中涌出，成为孤立在平地上的山丘，人们便称它为海涌山。\u201c何年海涌来？霹雳破地脉，裂透千仞深，嵌空削苍壁。\u201d宋人郑思肖的诗句形象地道出了虎丘的由来。如今虎丘虽已远离大海，人们依然能感受到海的踪影，海的信息。人们来到虎丘，未踏进头山门，就看到隔河照墙上嵌有\u201c海涌流辉\u201d四个大字；进山门后，一座石桥跨过环山河，桥被称作\u201c海涌桥\u201d；上山路旁的一些怪石，圆滑的石体是因为海浪冲刷而致；憨憨泉因为潜通大海，又被称作\u201c海涌泉\u201d；拥翠山庄月驾轩内立有清代学者钱大昕书写的\u201c海涌峰\u201d石刻。虎丘曾有过望海楼、海泉亭、海宴亭等胜景。在历代文人笔下，更可见虎丘与海的渊源，\u201c海当亭两面，山在寺中心。\u201d（白居易）\u201c宝刹近城郭，峰从海涌来。\u201d（顾瑛）\u201c尝疑海上峰，涌起自天外。\u201d（王鏊）虎丘，风景幽奇，风光如画，已有二千四百多年历史。《吴地记》曰：\u201c山绝崖纵壑，茂林深篁，为江左丘壑之表\u201d。宋朱长文《虎丘山有三绝》为：\u201c望山之形，不越岗陵，而登之者，风见层峰峭壁，势足千仞，一绝也；近邻郛郭，矗起原隰，旁无连续，万景都会，四边穹窿，北垣海虞，震泽沧州，云气出没，廓然四顾，指掌千里，二绝也；剑池泓淳，彻海浸云，不盈不虚，终古湛湛，三绝也\u201d。明代可流芳《虎丘有九宜》是\u201c宜月、宜雪、宜雨、宜烟、宜春晓、宜夏、宜秋爽、宜落木、宜夕阳\u201d。所以无论春夏秋冬、阴晴雨雪，各有致趣。   包含景点:二山门（断梁殿）憨憨泉云岩寺塔冷香阁第三泉剑池千人石可中亭白莲池拥翠山庄小武当西溪环翠揽月榭五十三参云在茶香试剑石万景山庄孙武子亭通幽轩虎丘仙人洞虎丘摩崖石刻养鹤涧真娘墓致爽阁","province":"江苏","city":"苏州"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        private List<ListBean> list;

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * name : 虎丘
             * content :    被誉为“吴中第一名胜”的虎丘，又名海涌山、海涌峰、虎阜，位于苏州古城西北，距阊门3.5公里的郊外。 虎丘海拔34.3米，占地约20公顷，山体为距今一亿五千万年的中生代侏罗纪时代喷发的岩浆凝结而成的流纹岩。<br>远古时代，虎丘曾是海湾中的一座随着海潮时隐时现的小岛，历经沧海桑田的变迁，最终从海中涌出，成为孤立在平地上的山丘，人们便称它为海涌山。“何年海涌来？霹雳破地脉，裂透千仞深，嵌空削苍壁。”宋人郑思肖的诗句形象地道出了虎丘的由来。如今虎丘虽已远离大海，人们依然能感受到海的踪影，海的信息。人们来到虎丘，未踏进头山门，就看到隔河照墙上嵌有“海涌流辉”四个大字；进山门后，一座石桥跨过环山河，桥被称作“海涌桥”；上山路旁的一些怪石，圆滑的石体是因为海浪冲刷而致；憨憨泉因为潜通大海，又被称作“海涌泉”；拥翠山庄月驾轩内立有清代学者钱大昕书写的“海涌峰”石刻。虎丘曾有过望海楼、海泉亭、海宴亭等胜景。在历代文人笔下，更可见虎丘与海的渊源，“海当亭两面，山在寺中心。”（白居易）“宝刹近城郭，峰从海涌来。”（顾瑛）“尝疑海上峰，涌起自天外。”（王鏊）虎丘，风景幽奇，风光如画，已有二千四百多年历史。《吴地记》曰：“山绝崖纵壑，茂林深篁，为江左丘壑之表”。宋朱长文《虎丘山有三绝》为：“望山之形，不越岗陵，而登之者，风见层峰峭壁，势足千仞，一绝也；近邻郛郭，矗起原隰，旁无连续，万景都会，四边穹窿，北垣海虞，震泽沧州，云气出没，廓然四顾，指掌千里，二绝也；剑池泓淳，彻海浸云，不盈不虚，终古湛湛，三绝也”。明代可流芳《虎丘有九宜》是“宜月、宜雪、宜雨、宜烟、宜春晓、宜夏、宜秋爽、宜落木、宜夕阳”。所以无论春夏秋冬、阴晴雨雪，各有致趣。   包含景点:二山门（断梁殿）憨憨泉云岩寺塔冷香阁第三泉剑池千人石可中亭白莲池拥翠山庄小武当西溪环翠揽月榭五十三参云在茶香试剑石万景山庄孙武子亭通幽轩虎丘仙人洞虎丘摩崖石刻养鹤涧真娘墓致爽阁
             * province : 江苏
             * city : 苏州
             */

            private String name;
            private String content;
            private String province;
            private String city;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }
        }
    }
}
