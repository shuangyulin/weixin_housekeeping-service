const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot2jpalw52/",
            name: "springboot2jpalw52",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot2jpalw52/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微信小程序的家政服务与互助平台"
        } 
    }
}
export default base
