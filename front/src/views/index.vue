<template>
    <div class="main">
        <Layout class="layout">
            <Header v-if="!isLogin" class="header">
                <div class="brand"><span>员工互评系统</span></div>
                <div class="user">
                    <span>{{userInfo.name}}</span> 丨
                    <a class="logout" @click="logout">退出</a>
                </div>
            </Header>
            <Content>
                <transition name="fade" mode="out-in">
                    <router-view></router-view>
                </transition>
            </Content>
        </Layout>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                userInfo: {
                    name: '大黄'
                }
            }
        },
        computed: {
            isLogin() {
                return this.$route.path.indexOf('login') > -1;
            }
        },
        methods: {
            logout() {
                this.$router.push('/login');
            }
        }
    }
</script>

<style scoped>
.main {
    height: 100vh;
    background-color: #f5f5f5;
}
.main .layout {
    height: 100%;
}
.main .header {
    overflow: hidden;
    color: white;
    font-size: 14px;
}
.main .brand {
    float: left;
    font-size: 22px;
    position: relative;
    height: 70%;
    width: 250px;
    background: rgba(255,255,255,.3);
    border-radius: 4px;
    top: 50%;
    transform: translateY(-50%);
    display: flex;
    justify-content: center;
    align-items: center;
}
.main .user {
    float: right;
}
.user .logout {
    color: white;
}
.user .logout:hover {
    color: #c5c5c5;
}
</style>
