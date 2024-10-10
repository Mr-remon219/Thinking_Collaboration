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
    import ziliaofenlei from '@/views/modules/ziliaofenlei/list'
    import xiangmufenlei from '@/views/modules/xiangmufenlei/list'
    import fuzeren from '@/views/modules/fuzeren/list'
    import xiangmuwendang from '@/views/modules/xiangmuwendang/list'
    import tuanduixiangmu from '@/views/modules/tuanduixiangmu/list'
    import chengyuan from '@/views/modules/chengyuan/list'


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
	path: '/ziliaofenlei',
        name: '资料分类',
        component: ziliaofenlei
      }
      ,{
	path: '/xiangmufenlei',
        name: '项目分类',
        component: xiangmufenlei
      }
      ,{
	path: '/fuzeren',
        name: '负责人',
        component: fuzeren
      }
      ,{
	path: '/xiangmuwendang',
        name: '项目文档',
        component: xiangmuwendang
      }
      ,{
	path: '/tuanduixiangmu',
        name: '团队项目',
        component: tuanduixiangmu
      }
      ,{
	path: '/chengyuan',
        name: '成员',
        component: chengyuan
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
