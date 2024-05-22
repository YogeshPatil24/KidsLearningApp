package com.mvvmmovies.kidslearningabcd.instance

import android.content.Context
import com.mvvmmovies.kidslearningabcd.R
import com.mvvmmovies.kidslearningabcd.models.AlphabetsModel

object Data {
    fun getData(context: Context): List<AlphabetsModel> {
        val mList = arrayListOf<AlphabetsModel>()

        val a = AlphabetsModel(
            R.drawable.apple_icon, context.getString(R.string.a), context.getString(R.string.a_desc)
        )
        val b = AlphabetsModel(
            R.drawable.ball_icon, context.getString(R.string.b), context.getString(R.string.b_desc)
        )
        val c = AlphabetsModel(
            R.drawable.cat, context.getString(R.string.c), context.getString(R.string.c_desc)
        )
        val d = AlphabetsModel(
            R.drawable.dog, context.getString(R.string.d), context.getString(R.string.d_desc)
        )
        val e = AlphabetsModel(
            R.drawable.elephant, context.getString(R.string.e), context.getString(R.string.e_desc)
        )
        val f = AlphabetsModel(
            R.drawable.fish, context.getString(R.string.f), context.getString(R.string.f_desc)
        )
        val g = AlphabetsModel(
            R.drawable.grapes, context.getString(R.string.g), context.getString(R.string.g_desc)
        )
        val h = AlphabetsModel(
            R.drawable.horse, context.getString(R.string.h), context.getString(R.string.h_desc)
        )
        val i = AlphabetsModel(
            R.drawable.icecream, context.getString(R.string.i), context.getString(R.string.i_desc)
        )
        val j = AlphabetsModel(
            R.drawable.jug, context.getString(R.string.j), context.getString(R.string.j_desc)
        )
        val k = AlphabetsModel(
            R.drawable.kite, context.getString(R.string.k), context.getString(R.string.k_desc)
        )
        val l = AlphabetsModel(
            R.drawable.lion, context.getString(R.string.l), context.getString(R.string.l_desc)
        )
        val m = AlphabetsModel(
            R.drawable.monkey, context.getString(R.string.m), context.getString(R.string.m_desc)
        )
        val n = AlphabetsModel(
            R.drawable.net, context.getString(R.string.n), context.getString(R.string.n_desc)
        )
        val o = AlphabetsModel(
            R.drawable.orange, context.getString(R.string.o), context.getString(R.string.o_desc)
        )
        val p = AlphabetsModel(
            R.drawable.peacock, context.getString(R.string.p), context.getString(R.string.p_desc)
        )
        val q = AlphabetsModel(
            R.drawable.quill, context.getString(R.string.q), context.getString(R.string.q_desc)
        )
        val r = AlphabetsModel(
            R.drawable.rose, context.getString(R.string.r), context.getString(R.string.r_desc)
        )
        val s = AlphabetsModel(
            R.drawable.swan, context.getString(R.string.s), context.getString(R.string.s_desc)
        )
        val t = AlphabetsModel(
            R.drawable.telephone, context.getString(R.string.t), context.getString(R.string.t_desc)
        )
        val u = AlphabetsModel(
            R.drawable.umbrella, context.getString(R.string.u), context.getString(R.string.u_desc)
        )
        val v = AlphabetsModel(
            R.drawable.van, context.getString(R.string.v), context.getString(R.string.v_desc)
        )
        val w = AlphabetsModel(
            R.drawable.watch, context.getString(R.string.w), context.getString(R.string.w_desc)
        )
        val x = AlphabetsModel(
            R.drawable.xylophone, context.getString(R.string.x), context.getString(R.string.x_desc)
        )
        val y = AlphabetsModel(
            R.drawable.yarn, context.getString(R.string.y), context.getString(R.string.y_desc)
        )
        val z = AlphabetsModel(
            R.drawable.zebra_new, context.getString(R.string.z), context.getString(R.string.z_desc)
        )
        mList.add(a)
        mList.add(b)
        mList.add(c)
        mList.add(d)
        mList.add(e)
        mList.add(f)
        mList.add(g)
        mList.add(h)
        mList.add(i)
        mList.add(j)
        mList.add(k)
        mList.add(l)
        mList.add(m)
        mList.add(n)
        mList.add(o)
        mList.add(p)
        mList.add(q)
        mList.add(r)
        mList.add(s)
        mList.add(t)
        mList.add(u)
        mList.add(v)
        mList.add(w)
        mList.add(x)
        mList.add(y)
        mList.add(z)
        return mList
    }
}