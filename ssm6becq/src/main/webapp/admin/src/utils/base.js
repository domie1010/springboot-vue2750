const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm6becq/",
            name: "ssm6becq",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm6becq/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智能小区管理系统"
        } 
    }
}
export default base
