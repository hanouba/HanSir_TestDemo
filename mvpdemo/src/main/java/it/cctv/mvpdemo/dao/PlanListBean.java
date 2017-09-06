package it.cctv.mvpdemo.dao;

/**
 * 创建者 by ${HanSir} on 2017/9/6.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class PlanListBean {

    /**
     * id : 1ef5835ae74f4e27ab1aacdd78f87c6c
     * createDate : 2017-08-30 14:03:51
     * updateDate : 2017-08-30 14:03:51
     * delFlag : 0
     * plan : {"id":"08734dc76fdb49e28d12247df2fc7ace","delFlag":"0","name":"梨园维护组每天现场巡检广丰收费站","beginDate":"2017-08-30","type":"1","period":"1","team":{"id":"b8b38026e7cf4ed885f471a0bd0cc1c7","delFlag":"0","name":"梨园维护组","sort":30,"namePy":"li yuan wei hu zu","shortPy":"li yuan wei hu zu","userCount":"0","parentName":"","parentId":"0"},"status":"0","road":{"id":"7b1b63f0c3b942bb9750daf2d66a8a11","delFlag":"0","name":"广丰收费站","sort":30,"type":"2","score":0,"parentId":"0","typeLabel":"内场","names":"广丰收费站"},"timeline":0,"executeCount":0,"createByName":"admin","statuCount":"0/744","finishRate":0,"typeLabel":"现场巡检","periodLabel":"每天","endDateLabel":"","recordStatus":{"status0":"744"},"beginDateLabel":"2017-08-30"}
     * status : 0
     * executerDate : 2017-08-30
     * expiryDate : 2017-08-30
     * progress : 0
     * decreases : 0
     * road : {"id":"c66183e257094ce9bcb51318a99c619c","delFlag":"0","name":"MTC出口车道2","sort":30,"longitude":"118.146598","latitude":"28.608561","score":0,"parentId":"0","typeLabel":"未设置","names":"MTC出口车道2"}
     * finishCount : 0
     * unfinishCount : 0
     * deviceCount : 0
     * limitCount : 0
     * thisYear : false
     * canExecut : false
     * canConfirm : false
     */

    private String id;
    private String createDate;
    private String updateDate;
    private String delFlag;
    private PlanBean plan;
    private String status;
    private String executerDate;
    private String expiryDate;
    private int progress;
    private int decreases;
    private RoadBeanX road;
    private int finishCount;
    private int unfinishCount;
    private int deviceCount;
    private int limitCount;
    private boolean thisYear;
    private boolean canExecut;
    private boolean canConfirm;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public PlanBean getPlan() {
        return plan;
    }

    public void setPlan(PlanBean plan) {
        this.plan = plan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExecuterDate() {
        return executerDate;
    }

    public void setExecuterDate(String executerDate) {
        this.executerDate = executerDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getDecreases() {
        return decreases;
    }

    public void setDecreases(int decreases) {
        this.decreases = decreases;
    }

    public RoadBeanX getRoad() {
        return road;
    }

    public void setRoad(RoadBeanX road) {
        this.road = road;
    }

    public int getFinishCount() {
        return finishCount;
    }

    public void setFinishCount(int finishCount) {
        this.finishCount = finishCount;
    }

    public int getUnfinishCount() {
        return unfinishCount;
    }

    public void setUnfinishCount(int unfinishCount) {
        this.unfinishCount = unfinishCount;
    }

    public int getDeviceCount() {
        return deviceCount;
    }

    public void setDeviceCount(int deviceCount) {
        this.deviceCount = deviceCount;
    }

    public int getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(int limitCount) {
        this.limitCount = limitCount;
    }

    public boolean isThisYear() {
        return thisYear;
    }

    public void setThisYear(boolean thisYear) {
        this.thisYear = thisYear;
    }

    public boolean isCanExecut() {
        return canExecut;
    }

    public void setCanExecut(boolean canExecut) {
        this.canExecut = canExecut;
    }

    public boolean isCanConfirm() {
        return canConfirm;
    }

    public void setCanConfirm(boolean canConfirm) {
        this.canConfirm = canConfirm;
    }

    public static class PlanBean {
        /**
         * id : 08734dc76fdb49e28d12247df2fc7ace
         * delFlag : 0
         * name : 梨园维护组每天现场巡检广丰收费站
         * beginDate : 2017-08-30
         * type : 1
         * period : 1
         * team : {"id":"b8b38026e7cf4ed885f471a0bd0cc1c7","delFlag":"0","name":"梨园维护组","sort":30,"namePy":"li yuan wei hu zu","shortPy":"li yuan wei hu zu","userCount":"0","parentName":"","parentId":"0"}
         * status : 0
         * road : {"id":"7b1b63f0c3b942bb9750daf2d66a8a11","delFlag":"0","name":"广丰收费站","sort":30,"type":"2","score":0,"parentId":"0","typeLabel":"内场","names":"广丰收费站"}
         * timeline : 0
         * executeCount : 0
         * createByName : admin
         * statuCount : 0/744
         * finishRate : 0
         * typeLabel : 现场巡检
         * periodLabel : 每天
         * endDateLabel :
         * recordStatus : {"status0":"744"}
         * beginDateLabel : 2017-08-30
         */

        private String id;
        private String delFlag;
        private String name;
        private String beginDate;
        private String type;
        private String period;
        private TeamBean team;
        private String status;
        private RoadBean road;
        private int timeline;
        private int executeCount;
        private String createByName;
        private String statuCount;
        private int finishRate;
        private String typeLabel;
        private String periodLabel;
        private String endDateLabel;
        private RecordStatusBean recordStatus;
        private String beginDateLabel;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDelFlag() {
            return delFlag;
        }

        public void setDelFlag(String delFlag) {
            this.delFlag = delFlag;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBeginDate() {
            return beginDate;
        }

        public void setBeginDate(String beginDate) {
            this.beginDate = beginDate;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getPeriod() {
            return period;
        }

        public void setPeriod(String period) {
            this.period = period;
        }

        public TeamBean getTeam() {
            return team;
        }

        public void setTeam(TeamBean team) {
            this.team = team;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public RoadBean getRoad() {
            return road;
        }

        public void setRoad(RoadBean road) {
            this.road = road;
        }

        public int getTimeline() {
            return timeline;
        }

        public void setTimeline(int timeline) {
            this.timeline = timeline;
        }

        public int getExecuteCount() {
            return executeCount;
        }

        public void setExecuteCount(int executeCount) {
            this.executeCount = executeCount;
        }

        public String getCreateByName() {
            return createByName;
        }

        public void setCreateByName(String createByName) {
            this.createByName = createByName;
        }

        public String getStatuCount() {
            return statuCount;
        }

        public void setStatuCount(String statuCount) {
            this.statuCount = statuCount;
        }

        public int getFinishRate() {
            return finishRate;
        }

        public void setFinishRate(int finishRate) {
            this.finishRate = finishRate;
        }

        public String getTypeLabel() {
            return typeLabel;
        }

        public void setTypeLabel(String typeLabel) {
            this.typeLabel = typeLabel;
        }

        public String getPeriodLabel() {
            return periodLabel;
        }

        public void setPeriodLabel(String periodLabel) {
            this.periodLabel = periodLabel;
        }

        public String getEndDateLabel() {
            return endDateLabel;
        }

        public void setEndDateLabel(String endDateLabel) {
            this.endDateLabel = endDateLabel;
        }

        public RecordStatusBean getRecordStatus() {
            return recordStatus;
        }

        public void setRecordStatus(RecordStatusBean recordStatus) {
            this.recordStatus = recordStatus;
        }

        public String getBeginDateLabel() {
            return beginDateLabel;
        }

        public void setBeginDateLabel(String beginDateLabel) {
            this.beginDateLabel = beginDateLabel;
        }

        public static class TeamBean {
            /**
             * id : b8b38026e7cf4ed885f471a0bd0cc1c7
             * delFlag : 0
             * name : 梨园维护组
             * sort : 30
             * namePy : li yuan wei hu zu
             * shortPy : li yuan wei hu zu
             * userCount : 0
             * parentName :
             * parentId : 0
             */

            private String id;
            private String delFlag;
            private String name;
            private int sort;
            private String namePy;
            private String shortPy;
            private String userCount;
            private String parentName;
            private String parentId;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getDelFlag() {
                return delFlag;
            }

            public void setDelFlag(String delFlag) {
                this.delFlag = delFlag;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public String getNamePy() {
                return namePy;
            }

            public void setNamePy(String namePy) {
                this.namePy = namePy;
            }

            public String getShortPy() {
                return shortPy;
            }

            public void setShortPy(String shortPy) {
                this.shortPy = shortPy;
            }

            public String getUserCount() {
                return userCount;
            }

            public void setUserCount(String userCount) {
                this.userCount = userCount;
            }

            public String getParentName() {
                return parentName;
            }

            public void setParentName(String parentName) {
                this.parentName = parentName;
            }

            public String getParentId() {
                return parentId;
            }

            public void setParentId(String parentId) {
                this.parentId = parentId;
            }
        }

        public static class RoadBean {
            /**
             * id : 7b1b63f0c3b942bb9750daf2d66a8a11
             * delFlag : 0
             * name : 广丰收费站
             * sort : 30
             * type : 2
             * score : 0
             * parentId : 0
             * typeLabel : 内场
             * names : 广丰收费站
             */

            private String id;
            private String delFlag;
            private String name;
            private int sort;
            private String type;
            private int score;
            private String parentId;
            private String typeLabel;
            private String names;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getDelFlag() {
                return delFlag;
            }

            public void setDelFlag(String delFlag) {
                this.delFlag = delFlag;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public String getParentId() {
                return parentId;
            }

            public void setParentId(String parentId) {
                this.parentId = parentId;
            }

            public String getTypeLabel() {
                return typeLabel;
            }

            public void setTypeLabel(String typeLabel) {
                this.typeLabel = typeLabel;
            }

            public String getNames() {
                return names;
            }

            public void setNames(String names) {
                this.names = names;
            }
        }

        public static class RecordStatusBean {
            /**
             * status0 : 744
             */

            private String status0;

            public String getStatus0() {
                return status0;
            }

            public void setStatus0(String status0) {
                this.status0 = status0;
            }
        }
    }

    public static class RoadBeanX {
        /**
         * id : c66183e257094ce9bcb51318a99c619c
         * delFlag : 0
         * name : MTC出口车道2
         * sort : 30
         * longitude : 118.146598
         * latitude : 28.608561
         * score : 0
         * parentId : 0
         * typeLabel : 未设置
         * names : MTC出口车道2
         */

        private String id;
        private String delFlag;
        private String name;
        private int sort;
        private String longitude;
        private String latitude;
        private int score;
        private String parentId;
        private String typeLabel;
        private String names;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDelFlag() {
            return delFlag;
        }

        public void setDelFlag(String delFlag) {
            this.delFlag = delFlag;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public String getTypeLabel() {
            return typeLabel;
        }

        public void setTypeLabel(String typeLabel) {
            this.typeLabel = typeLabel;
        }

        public String getNames() {
            return names;
        }

        public void setNames(String names) {
            this.names = names;
        }
    }
}
