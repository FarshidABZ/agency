package com.agency.utils

import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule

/**
 * Created by Farshid
 * since 10/25/2018.
 * contact farshidabazari@gmail.com
 */
@GlideModule
class CustomGlideModule : AppGlideModule() {

//    override fun registerComponents(context: Context, glide: Glide, registry: Registry) {
//        val client = UnsafeOkHttpClient.getOkHttpBuilder()
//                .apply { setTimeOutToOkHttpClient(this) }
//                .build()
//
//        registry.replace(
//            GlideUrl::class.java, InputStream::class.java,
//                OkHttpUrlLoader.Factory(client))
//    }

//    private fun setTimeOutToOkHttpClient(okHttpClientBuilder: OkHttpClient.Builder) = okHttpClientBuilder.apply {
//        readTimeout(BuildConfig.SOCKET_TIMEOUT_SECOND, TimeUnit.SECONDS)
//        connectTimeout(BuildConfig.CONNECTION_TIMEOUT_SECOND, TimeUnit.SECONDS)
//        writeTimeout(BuildConfig.WRITE_TIMEOUT_SECOND, TimeUnit.SECONDS)
//    }
}