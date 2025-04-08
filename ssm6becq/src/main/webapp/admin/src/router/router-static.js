import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yezhu from '@/views/modules/yezhu/list'
    import tousuchuli from '@/views/modules/tousuchuli/list'
    import yezhubaoxiu from '@/views/modules/yezhubaoxiu/list'
    import shebeiweixiu from '@/views/modules/shebeiweixiu/list'
    import jiatingchengyuan from '@/views/modules/jiatingchengyuan/list'
    import yezhutousu from '@/views/modules/yezhutousu/list'
    import baoxiuchuli from '@/views/modules/baoxiuchuli/list'
    import shuibiaoshuju from '@/views/modules/shuibiaoshuju/list'
    import fangchanxinxi from '@/views/modules/fangchanxinxi/list'
    import wuyeyuangong from '@/views/modules/wuyeyuangong/list'
    import tingchechangxinxi from '@/views/modules/tingchechangxinxi/list'
    import zhibanxinxi from '@/views/modules/zhibanxinxi/list'
    import shebeileixing from '@/views/modules/shebeileixing/list'
    import cheweixinxi from '@/views/modules/cheweixinxi/list'
    import jiaofeixinxi from '@/views/modules/jiaofeixinxi/list'
    import wuyeshebei from '@/views/modules/wuyeshebei/list'
    import huodongbaoming from '@/views/modules/huodongbaoming/list'
    import shequhuodong from '@/views/modules/shequhuodong/list'
    import dianbiaoshuju from '@/views/modules/dianbiaoshuju/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yezhu',
        name: '业主',
        component: yezhu
      }
      ,{
	path: '/tousuchuli',
        name: '投诉处理',
        component: tousuchuli
      }
      ,{
	path: '/yezhubaoxiu',
        name: '业主报修',
        component: yezhubaoxiu
      }
      ,{
	path: '/shebeiweixiu',
        name: '设备维修',
        component: shebeiweixiu
      }
      ,{
	path: '/jiatingchengyuan',
        name: '家庭成员',
        component: jiatingchengyuan
      }
      ,{
	path: '/yezhutousu',
        name: '业主投诉',
        component: yezhutousu
      }
      ,{
	path: '/baoxiuchuli',
        name: '报修处理',
        component: baoxiuchuli
      }
      ,{
	path: '/shuibiaoshuju',
        name: '水表数据',
        component: shuibiaoshuju
      }
      ,{
	path: '/fangchanxinxi',
        name: '房产信息',
        component: fangchanxinxi
      }
      ,{
	path: '/wuyeyuangong',
        name: '物业员工',
        component: wuyeyuangong
      }
      ,{
	path: '/tingchechangxinxi',
        name: '停车场信息',
        component: tingchechangxinxi
      }
      ,{
	path: '/zhibanxinxi',
        name: '值班信息',
        component: zhibanxinxi
      }
      ,{
	path: '/shebeileixing',
        name: '设备类型',
        component: shebeileixing
      }
      ,{
	path: '/cheweixinxi',
        name: '车位信息',
        component: cheweixinxi
      }
      ,{
	path: '/jiaofeixinxi',
        name: '缴费信息',
        component: jiaofeixinxi
      }
      ,{
	path: '/wuyeshebei',
        name: '物业设备',
        component: wuyeshebei
      }
      ,{
	path: '/huodongbaoming',
        name: '活动报名',
        component: huodongbaoming
      }
      ,{
	path: '/shequhuodong',
        name: '社区活动',
        component: shequhuodong
      }
      ,{
	path: '/dianbiaoshuju',
        name: '电表数据',
        component: dianbiaoshuju
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
