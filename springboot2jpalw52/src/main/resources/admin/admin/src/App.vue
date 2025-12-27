<template>
	<div id="app" class="">
		<router-view></router-view>
	</div>
</template>

<script>
	import watermark from 'watermark-dom';
	export default {
		name: "app",
		mounted() {
			
			if(window.location.href.indexOf('120.24.245.126') != -1){const option = { watermark_id: 'shuiyin_id',watermark_txt: '一搏',watermark_parent_node: null,watermark_angle: 30,watermark_alpha: 0.8,watermark_x_space: 100,watermark_y_space: 100,watermark_color: '#ff0000'};watermark.load(option);}
		}
	};
</script>

<style lang="scss">
	#shuiyin_id {position: fixed !important;top: 0 !important;left: 0 !important;z-index: 99999 !important;}

	* {
		padding: 0;
		margin: 0;
		box-sizing: border-box;
	}

	html,
	body {
		width: 100%;
		height: 100%;
	}

	#app {
		height: 100%;
	}

	body {
		padding: 0;
		margin: 0;

	}
</style>