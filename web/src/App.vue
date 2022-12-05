<template>
  <div>
    <div>Bot昵称： {{bot_name}}</div>
    <div>Bot战斗力： {{bot_rating}}</div>
  </div>
  <router-view/>
</template>

<script>
import $ from 'jquery'
import { ref } from 'vue'

export default {
  name: "App",
  setup: () => {
    let bot_name = ref("");
    let bot_rating = ref("");

    // 访问后端
    $.ajax({
      url: "http://127.0.0.1:8081/pk/getBotInfo/",
      type: "get",
      success: resp => {
        bot_name.value = resp.name;
        bot_rating.value = resp.rating;
      }
    });

    return {
      bot_name,
      bot_rating,
    }
  }
}

</script>

<style>
body{
  background-image: url("@/assets/background.png");
  background-size: cover;
}
</style>
