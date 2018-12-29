<template>
    <div class="login">
        <section class="login-box animated fadeIn">
            <h1 class="title">员工互评系统</h1>
            <div class="content">
                <Form ref="loginForm" :model="loginForm" :rules="validates">
                    <FormItem prop="acctno">
                        <Input class="item" v-model="loginForm.acctno" prefix="ios-person" size="large" placeholder="账号" @on-enter="login" />
                    </FormItem>
                    <FormItem prop="pwd">
                        <Input class="item" v-model="loginForm.pwd" prefix="ios-lock" type="password" size="large" placeholder="密码" @on-enter="login" />
                    </FormItem>
                </Form>
            </div>
            <Button class="btn" type="success" size="large" long @click="login">登 录</Button>
        </section>
    </div>
</template>

<script>
export default {
    data() {
        return {
            loginForm: {
                acctno: '',
                pwd: ''
            },
            validates: {
                acctno: [{ required: true, message: '账号不能为空', trigger: 'blur' }],
                pwd: [{ required: true, message: '密码不能为空', trigger: 'blur' }]
            }
        }
    },
    methods: {
        login() {
            this.$refs.loginForm.validate(valid => {
                if (valid) {
                    this.$router.push('/rate');
                } else {
                    this.$Message.error('请完善登录信息！');
                }
            })
        }
    }
}
</script>

<style scoped>
.login {
    height: 100vh;
    background-color: #2d3a4b
}
.login-box {
    width: 400px;
    height: 300px;
    position: relative;
    top: 35%;
    left: 50%;
    transform: translate(-50%, -50%);
    background-color: rgba(255, 255, 255, .1);
    border-radius: 10px;
    box-shadow: 0 0 8px #fff;
    overflow: hidden;
    text-align: center;
    padding: 40px;
}
.title {
    margin-bottom: 20px;
    color: #fff;
}
.btn {
    margin-top: 5px;
}

@media screen and (max-width: 550px) {
    .login-box {
        padding: 20px;
        width: 300px;
        height: 250px;
    }
    .title {
        margin-bottom: 15px;
        color: #fff;
    }
}
</style>
