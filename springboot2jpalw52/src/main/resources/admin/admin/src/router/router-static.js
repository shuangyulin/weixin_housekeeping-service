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
    import news from '@/views/modules/news/list'
    import discussjiazhengyuan from '@/views/modules/discussjiazhengyuan/list'
    import jiazhengyuan from '@/views/modules/jiazhengyuan/list'
    import tiezileixing from '@/views/modules/tiezileixing/list'
    import storeup from '@/views/modules/storeup/list'
    import fuwupingjia from '@/views/modules/fuwupingjia/list'
    import fuwuleixing from '@/views/modules/fuwuleixing/list'
    import tiezixinxi from '@/views/modules/tiezixinxi/list'
    import fuwujilu from '@/views/modules/fuwujilu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discussjiazhengfuwu from '@/views/modules/discussjiazhengfuwu/list'
    import chat from '@/views/modules/chat/list'
    import jiazhengfuwu from '@/views/modules/jiazhengfuwu/list'
    import fuwuyuyue from '@/views/modules/fuwuyuyue/list'
    import dingdantixing from '@/views/modules/dingdantixing/list'
    import config from '@/views/modules/config/list'
    import discusstiezixinxi from '@/views/modules/discusstiezixinxi/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
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
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/discussjiazhengyuan',
        name: '家政员评论',
        component: discussjiazhengyuan
      }
      ,{
	path: '/jiazhengyuan',
        name: '家政员',
        component: jiazhengyuan
      }
      ,{
	path: '/tiezileixing',
        name: '帖子类型',
        component: tiezileixing
      }
      ,{
	path: '/storeup',
        name: '我的收藏',
        component: storeup
      }
      ,{
	path: '/fuwupingjia',
        name: '服务评价',
        component: fuwupingjia
      }
      ,{
	path: '/fuwuleixing',
        name: '服务类型',
        component: fuwuleixing
      }
      ,{
	path: '/tiezixinxi',
        name: '帖子信息',
        component: tiezixinxi
      }
      ,{
	path: '/fuwujilu',
        name: '服务记录',
        component: fuwujilu
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discussjiazhengfuwu',
        name: '家政服务评论',
        component: discussjiazhengfuwu
      }
      ,{
	path: '/chat',
        name: '在线客服',
        component: chat
      }
      ,{
	path: '/jiazhengfuwu',
        name: '家政服务',
        component: jiazhengfuwu
      }
      ,{
	path: '/fuwuyuyue',
        name: '服务预约',
        component: fuwuyuyue
      }
      ,{
	path: '/dingdantixing',
        name: '订单提醒',
        component: dingdantixing
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/discusstiezixinxi',
        name: '帖子信息评论',
        component: discusstiezixinxi
      }
      ,{
	path: '/newstype',
        name: '公告信息分类',
        component: newstype
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
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
