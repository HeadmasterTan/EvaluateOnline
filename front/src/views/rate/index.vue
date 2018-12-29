<template>
    <div class="rate">
        <!-- 顶部信息 -->
        <section class="rate-top">
            <section class="top-flex">
                <span class="label">待评价人：</span>
                <Select class="top-select" v-model="selectedPerson">
                    <Option v-for="item in ratePerson" :key="item.id" :value="item.id" :label="item.name"></Option>
                </Select>
            </section>

            <section class="top-flex rate-info">
                <span class="label long">已评价 / 总人数</span>
                <div class="divider"></div>
                <span class="value">1 / {{ ratePerson.length }}</span>
            </section>
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
        <section class="empty" v-if="ratePerson.length > 0">
            请选择待评价人后开始评价。
        </section>
        <section class="empty" v-if="ratePerson.length === 0">
            你已经评完了！
        </section>
    </div>
</template>

<script>
export default {
    data() {
        return {
            selectedPerson: '', // 当前选中的人
            answers: [], // 当前选中的答案
            ratePerson: [{
                id: 1,
                name: '谭新'
            }, {
                id: 2,
                name: '汤选'
            }, {
                id: 3,
                name: '谭局'
            }, {
                id: 4,
                name: '谭大'
            }, {
                id: 5,
                name: '谭老板'
            }],
            subjectList: [{
                title: '员工表现',
                type: 'single',
                options: [{
                    message: '好'
                }, {
                    message: '一般'
                }, {
                    message: '差'
                }]
            }, {
                title: '员工态度',
                type: 'single',
                options: [{
                    message: '好'
                }, {
                    message: '一般'
                }, {
                    message: '合格'
                }, {
                    message: '差'
                }]
            }, {
                title: '员工薪资',
                type: 'multiple',
                options: [{
                    message: '低'
                }, {
                    message: '很低'
                }, {
                    message: '非常低'
                }, {
                    message: '零'
                }]
            }, {
                title: '文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试',
                type: 'multiple',
                options: [{
                    message: 'a'
                }, {
                    message: 'b'
                }, {
                    message: '文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试文本过长测试'
                }, {
                    message: 'c'
                }]
            }]
        }
    },
    created() {
        // this.subjectList = [].concat(this.subjectList, this.subjectList, this.subjectList, this.subjectList);
    },
    methods: {
        changeNumToEng(num) {
            let upCharNum = 65 + num; // 65 就是 A
            return String.fromCharCode(upCharNum);
        },
        submitAnswer() {
            console.log(this.answers);
        }
    }
}
</script>

<style scoped>
.rate {
    width: 70%;
    height: calc(100vh - 64px);
    position: relative;
    left: 50%;
    transform: translateX(-50%);
    background-color: #fff;
    overflow: hidden;
    border-left: solid 1px #eee;
    border-right: solid 1px #eee;
}
/* 顶部信息 */
.rate-top {
    display: flex;
    padding: 25px;
}
.rate-top .top-flex {
    display: flex;
    align-items: center;
}
.rate-top .rate-info {
    margin-left: 30px;
    border: solid 1px #dcdee2;
    border-radius: 4px;
    padding: 0px 10px;
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
    padding: 0px 25px;
    height: calc(100% - 82px);
    height: -moz-calc(100% - 82px);
    height: -webkit-calc(100% - 82px);
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
.empty {
    height: 200px;
    display: flex;
    align-items: center;
    width: 100%;
    justify-content: center;
    font-size: 24px;
    color: #808695;
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

@media screen and (max-width: 550px) {
    .rate {
        width: 100%;
        padding-bottom: 18px;
    }
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
