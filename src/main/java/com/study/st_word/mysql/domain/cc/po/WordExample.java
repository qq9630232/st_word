package com.study.st_word.mysql.domain.cc.po;

import java.util.ArrayList;
import java.util.List;

public class WordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andWordIdIsNull() {
            addCriterion("wordId is null");
            return (Criteria) this;
        }

        public Criteria andWordIdIsNotNull() {
            addCriterion("wordId is not null");
            return (Criteria) this;
        }

        public Criteria andWordIdEqualTo(Integer value) {
            addCriterion("wordId =", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdNotEqualTo(Integer value) {
            addCriterion("wordId <>", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdGreaterThan(Integer value) {
            addCriterion("wordId >", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wordId >=", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdLessThan(Integer value) {
            addCriterion("wordId <", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdLessThanOrEqualTo(Integer value) {
            addCriterion("wordId <=", value, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdIn(List<Integer> values) {
            addCriterion("wordId in", values, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdNotIn(List<Integer> values) {
            addCriterion("wordId not in", values, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdBetween(Integer value1, Integer value2) {
            addCriterion("wordId between", value1, value2, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wordId not between", value1, value2, "wordId");
            return (Criteria) this;
        }

        public Criteria andWordNameIsNull() {
            addCriterion("wordName is null");
            return (Criteria) this;
        }

        public Criteria andWordNameIsNotNull() {
            addCriterion("wordName is not null");
            return (Criteria) this;
        }

        public Criteria andWordNameEqualTo(String value) {
            addCriterion("wordName =", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameNotEqualTo(String value) {
            addCriterion("wordName <>", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameGreaterThan(String value) {
            addCriterion("wordName >", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameGreaterThanOrEqualTo(String value) {
            addCriterion("wordName >=", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameLessThan(String value) {
            addCriterion("wordName <", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameLessThanOrEqualTo(String value) {
            addCriterion("wordName <=", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameLike(String value) {
            addCriterion("wordName like", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameNotLike(String value) {
            addCriterion("wordName not like", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameIn(List<String> values) {
            addCriterion("wordName in", values, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameNotIn(List<String> values) {
            addCriterion("wordName not in", values, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameBetween(String value1, String value2) {
            addCriterion("wordName between", value1, value2, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameNotBetween(String value1, String value2) {
            addCriterion("wordName not between", value1, value2, "wordName");
            return (Criteria) this;
        }

        public Criteria andAudioIsNull() {
            addCriterion("audio is null");
            return (Criteria) this;
        }

        public Criteria andAudioIsNotNull() {
            addCriterion("audio is not null");
            return (Criteria) this;
        }

        public Criteria andAudioEqualTo(String value) {
            addCriterion("audio =", value, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioNotEqualTo(String value) {
            addCriterion("audio <>", value, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioGreaterThan(String value) {
            addCriterion("audio >", value, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioGreaterThanOrEqualTo(String value) {
            addCriterion("audio >=", value, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioLessThan(String value) {
            addCriterion("audio <", value, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioLessThanOrEqualTo(String value) {
            addCriterion("audio <=", value, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioLike(String value) {
            addCriterion("audio like", value, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioNotLike(String value) {
            addCriterion("audio not like", value, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioIn(List<String> values) {
            addCriterion("audio in", values, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioNotIn(List<String> values) {
            addCriterion("audio not in", values, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioBetween(String value1, String value2) {
            addCriterion("audio between", value1, value2, "audio");
            return (Criteria) this;
        }

        public Criteria andAudioNotBetween(String value1, String value2) {
            addCriterion("audio not between", value1, value2, "audio");
            return (Criteria) this;
        }

        public Criteria andExplanationIsNull() {
            addCriterion("explanation is null");
            return (Criteria) this;
        }

        public Criteria andExplanationIsNotNull() {
            addCriterion("explanation is not null");
            return (Criteria) this;
        }

        public Criteria andExplanationEqualTo(String value) {
            addCriterion("explanation =", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotEqualTo(String value) {
            addCriterion("explanation <>", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationGreaterThan(String value) {
            addCriterion("explanation >", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationGreaterThanOrEqualTo(String value) {
            addCriterion("explanation >=", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationLessThan(String value) {
            addCriterion("explanation <", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationLessThanOrEqualTo(String value) {
            addCriterion("explanation <=", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationLike(String value) {
            addCriterion("explanation like", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotLike(String value) {
            addCriterion("explanation not like", value, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationIn(List<String> values) {
            addCriterion("explanation in", values, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotIn(List<String> values) {
            addCriterion("explanation not in", values, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationBetween(String value1, String value2) {
            addCriterion("explanation between", value1, value2, "explanation");
            return (Criteria) this;
        }

        public Criteria andExplanationNotBetween(String value1, String value2) {
            addCriterion("explanation not between", value1, value2, "explanation");
            return (Criteria) this;
        }

        public Criteria andExampleIsNull() {
            addCriterion("example is null");
            return (Criteria) this;
        }

        public Criteria andExampleIsNotNull() {
            addCriterion("example is not null");
            return (Criteria) this;
        }

        public Criteria andExampleEqualTo(String value) {
            addCriterion("example =", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleNotEqualTo(String value) {
            addCriterion("example <>", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleGreaterThan(String value) {
            addCriterion("example >", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleGreaterThanOrEqualTo(String value) {
            addCriterion("example >=", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleLessThan(String value) {
            addCriterion("example <", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleLessThanOrEqualTo(String value) {
            addCriterion("example <=", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleLike(String value) {
            addCriterion("example like", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleNotLike(String value) {
            addCriterion("example not like", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleIn(List<String> values) {
            addCriterion("example in", values, "example");
            return (Criteria) this;
        }

        public Criteria andExampleNotIn(List<String> values) {
            addCriterion("example not in", values, "example");
            return (Criteria) this;
        }

        public Criteria andExampleBetween(String value1, String value2) {
            addCriterion("example between", value1, value2, "example");
            return (Criteria) this;
        }

        public Criteria andExampleNotBetween(String value1, String value2) {
            addCriterion("example not between", value1, value2, "example");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andStudyIsNull() {
            addCriterion("study is null");
            return (Criteria) this;
        }

        public Criteria andStudyIsNotNull() {
            addCriterion("study is not null");
            return (Criteria) this;
        }

        public Criteria andStudyEqualTo(Integer value) {
            addCriterion("study =", value, "study");
            return (Criteria) this;
        }

        public Criteria andStudyNotEqualTo(Integer value) {
            addCriterion("study <>", value, "study");
            return (Criteria) this;
        }

        public Criteria andStudyGreaterThan(Integer value) {
            addCriterion("study >", value, "study");
            return (Criteria) this;
        }

        public Criteria andStudyGreaterThanOrEqualTo(Integer value) {
            addCriterion("study >=", value, "study");
            return (Criteria) this;
        }

        public Criteria andStudyLessThan(Integer value) {
            addCriterion("study <", value, "study");
            return (Criteria) this;
        }

        public Criteria andStudyLessThanOrEqualTo(Integer value) {
            addCriterion("study <=", value, "study");
            return (Criteria) this;
        }

        public Criteria andStudyIn(List<Integer> values) {
            addCriterion("study in", values, "study");
            return (Criteria) this;
        }

        public Criteria andStudyNotIn(List<Integer> values) {
            addCriterion("study not in", values, "study");
            return (Criteria) this;
        }

        public Criteria andStudyBetween(Integer value1, Integer value2) {
            addCriterion("study between", value1, value2, "study");
            return (Criteria) this;
        }

        public Criteria andStudyNotBetween(Integer value1, Integer value2) {
            addCriterion("study not between", value1, value2, "study");
            return (Criteria) this;
        }

        public Criteria andRememberIsNull() {
            addCriterion("remember is null");
            return (Criteria) this;
        }

        public Criteria andRememberIsNotNull() {
            addCriterion("remember is not null");
            return (Criteria) this;
        }

        public Criteria andRememberEqualTo(Integer value) {
            addCriterion("remember =", value, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberNotEqualTo(Integer value) {
            addCriterion("remember <>", value, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberGreaterThan(Integer value) {
            addCriterion("remember >", value, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberGreaterThanOrEqualTo(Integer value) {
            addCriterion("remember >=", value, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberLessThan(Integer value) {
            addCriterion("remember <", value, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberLessThanOrEqualTo(Integer value) {
            addCriterion("remember <=", value, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberIn(List<Integer> values) {
            addCriterion("remember in", values, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberNotIn(List<Integer> values) {
            addCriterion("remember not in", values, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberBetween(Integer value1, Integer value2) {
            addCriterion("remember between", value1, value2, "remember");
            return (Criteria) this;
        }

        public Criteria andRememberNotBetween(Integer value1, Integer value2) {
            addCriterion("remember not between", value1, value2, "remember");
            return (Criteria) this;
        }

        public Criteria andCollectionIsNull() {
            addCriterion("collection is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIsNotNull() {
            addCriterion("collection is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionEqualTo(Integer value) {
            addCriterion("collection =", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotEqualTo(Integer value) {
            addCriterion("collection <>", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionGreaterThan(Integer value) {
            addCriterion("collection >", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection >=", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionLessThan(Integer value) {
            addCriterion("collection <", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionLessThanOrEqualTo(Integer value) {
            addCriterion("collection <=", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionIn(List<Integer> values) {
            addCriterion("collection in", values, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotIn(List<Integer> values) {
            addCriterion("collection not in", values, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionBetween(Integer value1, Integer value2) {
            addCriterion("collection between", value1, value2, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotBetween(Integer value1, Integer value2) {
            addCriterion("collection not between", value1, value2, "collection");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}