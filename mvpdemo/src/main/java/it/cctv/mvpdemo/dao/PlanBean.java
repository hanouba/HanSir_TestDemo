package it.cctv.mvpdemo.dao;

import java.util.List;

/**
 * 创建者 by ${HanSir} on 2017/8/11.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class PlanBean {

    /**
     * pageNo : 1
     * pageSize : 30
     * count : 1
     * list : [{"id":"846baee293da4a1aa07afd7dbe23f1e9","createDate":"2017-08-08 16:24:46","updateDate":"2017-08-08 16:24:46","delFlag":"0","name":"梨园维护组每周现场巡检广丰收费站","beginDate":"2017-08-08","endDate":"2017-12-31","type":"1","period":"2","team":{"id":"b8b38026e7cf4ed885f471a0bd0cc1c7","delFlag":"0","name":"梨园维护组","sort":30,"namePy":"li yuan wei hu zu","shortPy":"li yuan wei hu zu","userCount":"0","parentName":"","parentId":"0"},"status":"0","context":"","road":{"id":"7b1b63f0c3b942bb9750daf2d66a8a11","delFlag":"0","name":"广丰收费站","sort":30,"identification":"","owner":{"id":"e5eb7704840b42038cc1d2e3d0414849","delFlag":"0","name":"广丰收费站","sort":30,"namePy":"guang feng shou fei zhan","shortPy":"guang feng shou fei zhan","userCount":"0","parentName":"","parentId":"0"},"office":{"id":"b8b38026e7cf4ed885f471a0bd0cc1c7","delFlag":"0","name":"梨园维护组","sort":30,"namePy":"li yuan wei hu zu","shortPy":"li yuan wei hu zu","userCount":"0","parentName":"","parentId":"0"},"score":0,"parentId":"0","typeLabel":"未设置","names":"广丰收费站"},"timeline":0,"dataRang":"2017-08-08 至 2017-12-31","executeCount":0,"createByName":"陈杰建","statuCount":"0/120,5/6","finishRate":0,"typeLabel":"现场巡检","beginDateLabel":"2017-08-08","periodLabel":"每周","endDateLabel":"2017-12-31","recordStatus":{"status0":"120","status5":"6"}}]
     * firstResult : 0
     * maxResults : 30
     */

    private int pageNo;
    private int pageSize;
    private int count;
    private int firstResult;
    private int maxResults;
    private List<ListBean> list;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getFirstResult() {
        return firstResult;
    }

    public void setFirstResult(int firstResult) {
        this.firstResult = firstResult;
    }

    public int getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(int maxResults) {
        this.maxResults = maxResults;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * id : 846baee293da4a1aa07afd7dbe23f1e9
         * createDate : 2017-08-08 16:24:46
         * updateDate : 2017-08-08 16:24:46
         * delFlag : 0
         * name : 梨园维护组每周现场巡检广丰收费站
         * beginDate : 2017-08-08
         * endDate : 2017-12-31
         * type : 1
         * period : 2
         * team : {"id":"b8b38026e7cf4ed885f471a0bd0cc1c7","delFlag":"0","name":"梨园维护组","sort":30,"namePy":"li yuan wei hu zu","shortPy":"li yuan wei hu zu","userCount":"0","parentName":"","parentId":"0"}
         * status : 0
         * context :
         * road : {"id":"7b1b63f0c3b942bb9750daf2d66a8a11","delFlag":"0","name":"广丰收费站","sort":30,"identification":"","owner":{"id":"e5eb7704840b42038cc1d2e3d0414849","delFlag":"0","name":"广丰收费站","sort":30,"namePy":"guang feng shou fei zhan","shortPy":"guang feng shou fei zhan","userCount":"0","parentName":"","parentId":"0"},"office":{"id":"b8b38026e7cf4ed885f471a0bd0cc1c7","delFlag":"0","name":"梨园维护组","sort":30,"namePy":"li yuan wei hu zu","shortPy":"li yuan wei hu zu","userCount":"0","parentName":"","parentId":"0"},"score":0,"parentId":"0","typeLabel":"未设置","names":"广丰收费站"}
         * timeline : 0
         * dataRang : 2017-08-08 至 2017-12-31
         * executeCount : 0
         * createByName : 陈杰建
         * statuCount : 0/120,5/6
         * finishRate : 0
         * typeLabel : 现场巡检
         * beginDateLabel : 2017-08-08
         * periodLabel : 每周
         * endDateLabel : 2017-12-31
         * recordStatus : {"status0":"120","status5":"6"}
         */

        private String id;
        private String createDate;
        private String updateDate;
        private String delFlag;
        private String name;
        private String beginDate;
        private String endDate;
        private String type;
        private String period;
        private TeamBean team;
        private String status;
        private String context;
        private RoadBean road;
        private int timeline;
        private String dataRang;
        private int executeCount;
        private String createByName;
        private String statuCount;
        private int finishRate;
        private String typeLabel;
        private String beginDateLabel;
        private String periodLabel;
        private String endDateLabel;
        private RecordStatusBean recordStatus;

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

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
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

        public String getContext() {
            return context;
        }

        public void setContext(String context) {
            this.context = context;
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

        public String getDataRang() {
            return dataRang;
        }

        public void setDataRang(String dataRang) {
            this.dataRang = dataRang;
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

        public String getBeginDateLabel() {
            return beginDateLabel;
        }

        public void setBeginDateLabel(String beginDateLabel) {
            this.beginDateLabel = beginDateLabel;
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
             * identification :
             * owner : {"id":"e5eb7704840b42038cc1d2e3d0414849","delFlag":"0","name":"广丰收费站","sort":30,"namePy":"guang feng shou fei zhan","shortPy":"guang feng shou fei zhan","userCount":"0","parentName":"","parentId":"0"}
             * office : {"id":"b8b38026e7cf4ed885f471a0bd0cc1c7","delFlag":"0","name":"梨园维护组","sort":30,"namePy":"li yuan wei hu zu","shortPy":"li yuan wei hu zu","userCount":"0","parentName":"","parentId":"0"}
             * score : 0
             * parentId : 0
             * typeLabel : 未设置
             * names : 广丰收费站
             */

            private String id;
            private String delFlag;
            private String name;
            private int sort;
            private String identification;
            private OwnerBean owner;
            private OfficeBean office;
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

            public String getIdentification() {
                return identification;
            }

            public void setIdentification(String identification) {
                this.identification = identification;
            }

            public OwnerBean getOwner() {
                return owner;
            }

            public void setOwner(OwnerBean owner) {
                this.owner = owner;
            }

            public OfficeBean getOffice() {
                return office;
            }

            public void setOffice(OfficeBean office) {
                this.office = office;
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

            public static class OwnerBean {
                /**
                 * id : e5eb7704840b42038cc1d2e3d0414849
                 * delFlag : 0
                 * name : 广丰收费站
                 * sort : 30
                 * namePy : guang feng shou fei zhan
                 * shortPy : guang feng shou fei zhan
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

            public static class OfficeBean {
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
        }

        public static class RecordStatusBean {
            /**
             * status0 : 120
             * status5 : 6
             */

            private String status0;
            private String status5;

            public String getStatus0() {
                return status0;
            }

            public void setStatus0(String status0) {
                this.status0 = status0;
            }

            public String getStatus5() {
                return status5;
            }

            public void setStatus5(String status5) {
                this.status5 = status5;
            }
        }
    }
}
