package com.xsylsb.integrity.base;

import java.util.List;

/**
 * @author glsite.com
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */
public class FaceRecongitRGBBase {

    /**
     * suc : true
     * msg : ["严禁进入冷轧厂作业","此人所属单位未入场"]
     * data : {"faceImagesUrl":null,"age":26,"dengJiTag":"厂级","statusTag":"在岗","workShop":null,"workArea":null,"boss":null,"workJob":null,"securityClassHour":0,"sanJiAnQuanPeiXunClassHour":0,"zaiJiaoYuPeiXunClassHour":0,"id":28,"role":0,"bossId":1,"userName":null,"idno":"340102199305011666","idstarTime":null,"idendTime":null,"faceImages":null,"password":"53944E75DFF079B8","fullName":"蔡测试","gender":0,"birthday":"1993-05-01T00:00:00","companyId":6,"workShopId":null,"workAreaId":10,"jobId":3,"dengJi":1,"safetyExamination":false,"isCompanyHead":false,"isSpecialOperator":false,"isSafetyManager":false,"totalBadRecordScore":0,"totalViolationRecord":0,"totalCompanyHour":0,"status":0,"leaveTime":null,"createTime":"2019-07-15T15:38:05.107","blacklist":null,"badRecordItem":[],"courseExamRecord":[],"courseSignIn":[],"jobRecord":[],"notice":[],"operationCertificate":[],"violationRecord":[],"workAreaBoss":[]}
     * code : 200
     */

    private boolean suc;
    private DataBean data;
    private int code;
    private List<String> msg;

    public boolean isSuc() {
        return suc;
    }

    public void setSuc(boolean suc) {
        this.suc = suc;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<String> getMsg() {
        return msg;
    }

    public void setMsg(List<String> msg) {
        this.msg = msg;
    }

    public static class DataBean {
        /**
         * faceImagesUrl : null
         * age : 26
         * dengJiTag : 厂级
         * statusTag : 在岗
         * workShop : null
         * workArea : null
         * boss : null
         * workJob : null
         * securityClassHour : 0
         * sanJiAnQuanPeiXunClassHour : 0
         * zaiJiaoYuPeiXunClassHour : 0
         * id : 28
         * role : 0
         * bossId : 1
         * userName : null
         * idno : 340102199305011666
         * idstarTime : null
         * idendTime : null
         * faceImages : null
         * password : 53944E75DFF079B8
         * fullName : 蔡测试
         * gender : 0
         * birthday : 1993-05-01T00:00:00
         * companyId : 6
         * workShopId : null
         * workAreaId : 10
         * jobId : 3
         * dengJi : 1
         * safetyExamination : false
         * isCompanyHead : false
         * isSpecialOperator : false
         * isSafetyManager : false
         * totalBadRecordScore : 0
         * totalViolationRecord : 0
         * totalCompanyHour : 0
         * status : 0
         * leaveTime : null
         * createTime : 2019-07-15T15:38:05.107
         * blacklist : null
         * badRecordItem : []
         * courseExamRecord : []
         * courseSignIn : []
         * jobRecord : []
         * notice : []
         * operationCertificate : []
         * violationRecord : []
         * workAreaBoss : []
         */

        private Object faceImagesUrl;
        private int age;
        private String dengJiTag;
        private String statusTag;
        private Object workShop;
        private Object workArea;
        private Object boss;
        private Object workJob;
        private int securityClassHour;
        private int sanJiAnQuanPeiXunClassHour;
        private int zaiJiaoYuPeiXunClassHour;
        private int id;
        private int role;
        private int bossId;
        private Object userName;
        private String idno;
        private Object idstarTime;
        private Object idendTime;
        private Object faceImages;
        private String password;
        private String fullName;
        private int gender;
        private String birthday;
        private int companyId;
        private Object workShopId;
        private int workAreaId;
        private int jobId;
        private int dengJi;
        private boolean safetyExamination;
        private boolean isCompanyHead;
        private boolean isSpecialOperator;
        private boolean isSafetyManager;
        private int totalBadRecordScore;
        private int totalViolationRecord;
        private int totalCompanyHour;
        private int status;
        private Object leaveTime;
        private String createTime;
        private Object blacklist;
        private List<?> badRecordItem;
        private List<?> courseExamRecord;
        private List<?> courseSignIn;
        private List<?> jobRecord;
        private List<?> notice;
        private List<?> operationCertificate;
        private List<?> violationRecord;
        private List<?> workAreaBoss;

        public Object getFaceImagesUrl() {
            return faceImagesUrl;
        }

        public void setFaceImagesUrl(Object faceImagesUrl) {
            this.faceImagesUrl = faceImagesUrl;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getDengJiTag() {
            return dengJiTag;
        }

        public void setDengJiTag(String dengJiTag) {
            this.dengJiTag = dengJiTag;
        }

        public String getStatusTag() {
            return statusTag;
        }

        public void setStatusTag(String statusTag) {
            this.statusTag = statusTag;
        }

        public Object getWorkShop() {
            return workShop;
        }

        public void setWorkShop(Object workShop) {
            this.workShop = workShop;
        }

        public Object getWorkArea() {
            return workArea;
        }

        public void setWorkArea(Object workArea) {
            this.workArea = workArea;
        }

        public Object getBoss() {
            return boss;
        }

        public void setBoss(Object boss) {
            this.boss = boss;
        }

        public Object getWorkJob() {
            return workJob;
        }

        public void setWorkJob(Object workJob) {
            this.workJob = workJob;
        }

        public int getSecurityClassHour() {
            return securityClassHour;
        }

        public void setSecurityClassHour(int securityClassHour) {
            this.securityClassHour = securityClassHour;
        }

        public int getSanJiAnQuanPeiXunClassHour() {
            return sanJiAnQuanPeiXunClassHour;
        }

        public void setSanJiAnQuanPeiXunClassHour(int sanJiAnQuanPeiXunClassHour) {
            this.sanJiAnQuanPeiXunClassHour = sanJiAnQuanPeiXunClassHour;
        }

        public int getZaiJiaoYuPeiXunClassHour() {
            return zaiJiaoYuPeiXunClassHour;
        }

        public void setZaiJiaoYuPeiXunClassHour(int zaiJiaoYuPeiXunClassHour) {
            this.zaiJiaoYuPeiXunClassHour = zaiJiaoYuPeiXunClassHour;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getRole() {
            return role;
        }

        public void setRole(int role) {
            this.role = role;
        }

        public int getBossId() {
            return bossId;
        }

        public void setBossId(int bossId) {
            this.bossId = bossId;
        }

        public Object getUserName() {
            return userName;
        }

        public void setUserName(Object userName) {
            this.userName = userName;
        }

        public String getIdno() {
            return idno;
        }

        public void setIdno(String idno) {
            this.idno = idno;
        }

        public Object getIdstarTime() {
            return idstarTime;
        }

        public void setIdstarTime(Object idstarTime) {
            this.idstarTime = idstarTime;
        }

        public Object getIdendTime() {
            return idendTime;
        }

        public void setIdendTime(Object idendTime) {
            this.idendTime = idendTime;
        }

        public Object getFaceImages() {
            return faceImages;
        }

        public void setFaceImages(Object faceImages) {
            this.faceImages = faceImages;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public int getCompanyId() {
            return companyId;
        }

        public void setCompanyId(int companyId) {
            this.companyId = companyId;
        }

        public Object getWorkShopId() {
            return workShopId;
        }

        public void setWorkShopId(Object workShopId) {
            this.workShopId = workShopId;
        }

        public int getWorkAreaId() {
            return workAreaId;
        }

        public void setWorkAreaId(int workAreaId) {
            this.workAreaId = workAreaId;
        }

        public int getJobId() {
            return jobId;
        }

        public void setJobId(int jobId) {
            this.jobId = jobId;
        }

        public int getDengJi() {
            return dengJi;
        }

        public void setDengJi(int dengJi) {
            this.dengJi = dengJi;
        }

        public boolean isSafetyExamination() {
            return safetyExamination;
        }

        public void setSafetyExamination(boolean safetyExamination) {
            this.safetyExamination = safetyExamination;
        }

        public boolean isIsCompanyHead() {
            return isCompanyHead;
        }

        public void setIsCompanyHead(boolean isCompanyHead) {
            this.isCompanyHead = isCompanyHead;
        }

        public boolean isIsSpecialOperator() {
            return isSpecialOperator;
        }

        public void setIsSpecialOperator(boolean isSpecialOperator) {
            this.isSpecialOperator = isSpecialOperator;
        }

        public boolean isIsSafetyManager() {
            return isSafetyManager;
        }

        public void setIsSafetyManager(boolean isSafetyManager) {
            this.isSafetyManager = isSafetyManager;
        }

        public int getTotalBadRecordScore() {
            return totalBadRecordScore;
        }

        public void setTotalBadRecordScore(int totalBadRecordScore) {
            this.totalBadRecordScore = totalBadRecordScore;
        }

        public int getTotalViolationRecord() {
            return totalViolationRecord;
        }

        public void setTotalViolationRecord(int totalViolationRecord) {
            this.totalViolationRecord = totalViolationRecord;
        }

        public int getTotalCompanyHour() {
            return totalCompanyHour;
        }

        public void setTotalCompanyHour(int totalCompanyHour) {
            this.totalCompanyHour = totalCompanyHour;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public Object getLeaveTime() {
            return leaveTime;
        }

        public void setLeaveTime(Object leaveTime) {
            this.leaveTime = leaveTime;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getBlacklist() {
            return blacklist;
        }

        public void setBlacklist(Object blacklist) {
            this.blacklist = blacklist;
        }

        public List<?> getBadRecordItem() {
            return badRecordItem;
        }

        public void setBadRecordItem(List<?> badRecordItem) {
            this.badRecordItem = badRecordItem;
        }

        public List<?> getCourseExamRecord() {
            return courseExamRecord;
        }

        public void setCourseExamRecord(List<?> courseExamRecord) {
            this.courseExamRecord = courseExamRecord;
        }

        public List<?> getCourseSignIn() {
            return courseSignIn;
        }

        public void setCourseSignIn(List<?> courseSignIn) {
            this.courseSignIn = courseSignIn;
        }

        public List<?> getJobRecord() {
            return jobRecord;
        }

        public void setJobRecord(List<?> jobRecord) {
            this.jobRecord = jobRecord;
        }

        public List<?> getNotice() {
            return notice;
        }

        public void setNotice(List<?> notice) {
            this.notice = notice;
        }

        public List<?> getOperationCertificate() {
            return operationCertificate;
        }

        public void setOperationCertificate(List<?> operationCertificate) {
            this.operationCertificate = operationCertificate;
        }

        public List<?> getViolationRecord() {
            return violationRecord;
        }

        public void setViolationRecord(List<?> violationRecord) {
            this.violationRecord = violationRecord;
        }

        public List<?> getWorkAreaBoss() {
            return workAreaBoss;
        }

        public void setWorkAreaBoss(List<?> workAreaBoss) {
            this.workAreaBoss = workAreaBoss;
        }
    }
}
