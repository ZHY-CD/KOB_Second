<template>
    <ContentFieldVue>
        我的Bot
    </ContentFieldVue>
</template>

<script>
import ContentFieldVue from '@/components/ContentField.vue';
import $ from 'jquery'
import { useStore } from 'vuex'

export default {
    components:{
        ContentFieldVue,
    },
    setup() {
        const store = useStore();
        // $.ajax({
        //     url: "http://127.0.0.1:8082/user/bot/add/",
        //     type: "POST",
        //     data: {
        //         title: "Bot的标题",
        //         description : "Bot的描述",
        //         content: "Bot的代码",
        //     },
        //     headers: {
        //         Authorization: "Bearer " + store.state.user.token,
        //     },
        //     success(resp) {
        //         console.log(resp);
        //     },
        //     error(resp) {
        //         console.log(resp);
        //     }
        // })

        // $.ajax({
        //     url: "http://127.0.0.1:8082/user/bot/remove/",
        //     type: "POST",
        //     data: {
        //         bot_id: 9,
        //     },
        //     headers: {
        //         Authorization: "Bearer " + store.state.user.token,
        //     },
        //     success(resp) {
        //         console.log(resp);
        //     },
        //     error(resp) {
        //         console.log(resp);
        //     }
        // })

        // $.ajax({
        //     url: "http://127.0.0.1:8082/user/bot/update/",
        //     type: "POST",
        //     data: {
        //         bot_id: 2,
        //         title: "Bot的标题2",
        //         description : "Bot的描述2",
        //         content: "Bot的代码2",
        //     },
        //     headers: {
        //         Authorization: "Bearer " + store.state.user.token,
        //     },
        //     success(resp) {
        //         console.log(resp);
        //     },
        //     error(resp) {
        //         console.log(resp);
        //     }
        // })

        $.ajax({
            url: "http://127.0.0.1:8082/user/bot/getlist/",
            type: "get",
            headers: {
                Authorization: "Bearer " + store.state.user.token,
            },
            success(resp) {
                console.log(resp);
            },
            error(resp) {
                console.log(resp);
            }
        })



    }
}
</script>

<style scoped>

</style>