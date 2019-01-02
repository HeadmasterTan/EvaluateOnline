<template>
    <div class="rating">
        <!-- 顶部信息 -->
        <section class="rate-top">
            <section class="top-flex">
                <span class="label">{{ getPrefix }}评价人：</span>
                <Select class="top-select" v-model="selectedPerson" @on-change="changePerson">
                    <Option v-for="item in ratePerson" :key="item.id" :value="item.id" :label="item.name"></Option>
                </Select>
            </section>
            <section class="top-flex rate-info" v-if="rateType === 0">
                <span class="label long">已评价 / 总人数</span>
                <div class="divider"></div>
                <span class="value">{{ ratedNum }} / {{ ratePerson.length }}</span>
            </section>
            <span class="surplus-num" v-if="rateType === 1 && selectedPerson">剩余修改次数：{{ surplusNum }}</span>
        </section>
        <!-- 选项内容 -->
        <section class="rate-content animated fadeIn" v-show="selectedPerson">
            <div class="content-item" v-for="(item, index) in subjectList" :key="item.id">
                <Card class="card-item">
                    <p slot="title" :title="item.title">{{ `${index + 1}、${item.title}` }}</p>
                    <div class="select-list">
                        <RadioGroup v-if="item.type === 'single'" v-model="answers[index]">
                            <Radio class="list-item" v-for="(option, num) in item.options" :key="option.id" :label="`${changeNumToEng(num)}：${option.message}`"></Radio>
                        </RadioGroup>
                        <CheckboxGroup v-if="item.type === 'multiple'" v-model="answers[index]">
                            <Checkbox class="list-item" v-for="(option, num) in item.options" :key="option.id" :label="`${changeNumToEng(num)}：${option.message}`"></Checkbox>
                        </CheckboxGroup>
                    </div>
                </Card>
            </div>
            <div class="btn-content">
                <Button class="submit-btn" type="success" @click="submitAnswer">提 交</Button>
            </div>
        </section>
        <!-- 提示语 -->
        <section class="empty" v-if="!selectedPerson">
            请选择待评价人后开始评价。
        </section>
        <section class="empty" v-if="ratePerson.length === 0">
            你已经评完了！
        </section>
    </div>
</template>

<script>
export default {
    props: {
        ratePerson: { // 评价人
            type: Array
        },
        subjectList: { // 题库
            type: Array
        },
        rateType: { // 评价类型
            type: Number
        }
    },
    data() {
        return {
            selectedPerson: '', // 当前选中的人
            answers: [], // 当前选中的答案
            ratedNum: 1, // 已评价人数
            surplusNum: 3 // 剩余修改次数
        }
    },
    computed: {
        /**
         * 返回前缀
         */
        getPrefix() {
            return this.rateType === 0 ? '待' : '已';
        }
    },
    methods: {
        /**
         * 将数字转化为大写字母
         */
        changeNumToEng(num) {
            let upCharNum = 65 + num; // 65 就是 A
            return String.fromCharCode(upCharNum);
        },
        /**
         * 将大写字母转化为数字
         */
        changeEndToNum(eng) {
            return eng.charCodeAt() - 64
        },
        /**
         * 提交评价答案
         */
        submitAnswer() {
            const OPTIONS_LENGTH = this.subjectList.length;
            let answers = [];
            for (let i = 0; i < OPTIONS_LENGTH; i++) {
                if (!this.answers[i]) {
                    this.$Message.error('还有评价未选！');
                    return;
                }
                // 构建答案
                if (typeof this.answers[i] === 'string') {
                    answers.push(this.changeEndToNum(this.answers[i].substr(0, 1)));
                } else {
                    let answer = [];
                    for (let j = 0; j < this.answers[i].length; j++) {
                        answer.push(this.changeEndToNum(this.answers[i][j].substr(0, 1)));
                    }
                    answers.push(answer.sort());
                }
            }
            this.delPerson();
            // answers 为已选答案
            // do something
        },
        /**
         * 删除当前被评价人
         */
        delPerson() {
            for (let i = 0; this.ratePerson.length; i++) {
                if (this.selectedPerson === this.ratePerson[i].id) {
                    this.ratePerson.splice(i, 1);
                    break;
                }
            }
            this.selectedPerson = '';
        },
        /**
         * 切换人员的时候将答案置为空
         */
        changePerson() {
            this.answers = [];
        }
    }
}
</script>

<style scoped>
/* 顶部信息 */
.rate-top {
    display: flex;
    align-items: center;
}
.rate-top .top-flex {
    display: flex;
    align-items: center;
}
.rate-top .rate-info {
    height: 32px;
    margin-left: 30px;
    border: solid 1px #dcdee2;
    border-radius: 4px;
    padding: 0px 10px;
}
.rate-top .surplus-num {
    margin-left: 30px;
    font-size: 14px;
}
.rate-info .divider {
    width: 1px;
    height: 100%;
    background: #dcdee2;
    margin: 0px 10px;
}
.rate-top .label {
    display: block;
    width: 75px;
    font-size: 14px;
}
.label.long {
    width: 100px;
}
.rate-top .top-select {
    width: 200px;
}
/* 选项内容 */
.rate-content {
    padding-top: 25px;
    padding-bottom: 50px;
    overflow-y: auto;
}
.card-item {
    margin-bottom: 15px;
}
.rate-content .title {
    font-size: 14px;
}
.rate-content .select-list .list-item {
    margin-top: 5px;
    margin-right: 40px;
    white-space: normal;
    text-align: justify;
}
.btn-content {
    text-align: center;
}
.submit-btn {
    margin-top: 30px;
    width: 150px;
}
/* 滚动条样式 */
.rate-content::-webkit-scrollbar {
    width: 12px;
    background-color: #F5F5F5;
}
.rate-content::-webkit-scrollbar-thumb {
    border-radius: 10px;
    -webkit-box-shadow: inset 0 0 6px rgba(0, 0, 0, .1);
    background-color: #999;
}
.rate-content::-webkit-scrollbar-thumb:hover {
    background-color: #555;
}
.rate-content::-webkit-scrollbar-track {
    -webkit-box-shadow: inset 0 0 6px rgba(0, 0, 0, 0.1);
    border-radius: 10px;
    background-color: #F5F5F5;
}
.empty {
    height: 200px;
    display: flex;
    align-items: center;
    width: 100%;
    justify-content: center;
    font-size: 24px;
    color: #808695;
}

@media screen and (max-width: 550px) {
    .rate-top {
        flex-wrap: wrap;
        padding: 15px 25px;
    }
    .rate-top .rate-info {
        margin: 15px 0 0 75px;
        height: 32px;
    }
}
</style>

<style>
.card-item .ivu-card-head p {
    overflow: visible;
    white-space: pre-wrap;
    text-align: justify;
}
.select-list .ivu-radio-group {
    width: 100%;
    overflow: hidden;
    text-overflow: ellipsis;
}
</style>