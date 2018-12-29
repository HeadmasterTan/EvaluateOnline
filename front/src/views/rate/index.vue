<template>
    <div class="rate">
        <Tabs type="card" :animated="false">
            <TabPane label="待评价">
                <rating :rate-person="ratePerson" :subject-list="subjectList" :rate-type="0"></rating>
            </TabPane>
            <TabPane label="已评价">
                <rating :rate-person="ratedPerson" :subject-list="subjectList" :rate-type="1"></rating>
            </TabPane>
        </Tabs>
    </div>
</template>

<script>
import Rating from './rate';

export default {
    components: { Rating },
    data() {
        return {
            // 待评价人列表
            ratePerson: [{
                id: 1,
                name: '谭新'
            }, {
                id: 2,
                name: '汤选'
            }, {
                id: 3,
                name: '谭局'
            }],
            // 已评价人列表
            ratedPerson: [ {
                id: 4,
                name: '谭大'
            }, {
                id: 5,
                name: '谭老板'
            }],
            // 评价题目
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
                type: 'single',
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
    }
}
</script>

<style scoped>
.rate {
    width: 70%;
    height: calc(100vh - 64px);
    padding: 25px;
    position: relative;
    left: 50%;
    transform: translateX(-50%);
    background-color: #fff;
    overflow: hidden;
    border-left: solid 1px #eee;
    border-right: solid 1px #eee;
}

@media screen and (max-width: 550px) {
    .rate {
        width: 100%;
        padding-bottom: 18px;
    }
}
</style>
