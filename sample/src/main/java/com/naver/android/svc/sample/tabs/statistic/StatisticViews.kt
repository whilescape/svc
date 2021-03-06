/*
 * Copyright 2018 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.naver.android.svc.sample.tabs.statistic

import android.graphics.Color
import com.naver.android.svc.core.views.ActionViews
import com.naver.android.svc.sample.R
import kotlinx.android.synthetic.main.fragment_statistic.view.*

class StatisticViews : ActionViews<StatisticViewsAction>() {

    override val layoutResId = R.layout.fragment_statistic

    override fun onCreated() {
        rootView.tv_name.setOnClickListener { viewsAction.onClickName() }
        rootView.tv_extra.setOnClickListener { viewsAction.onClickExtra() }
        rootView.statistic_icon.setColorFilter(Color.WHITE)
    }

    fun setName(name: String) {
        rootView.tv_name.text = name
    }

    fun setExtra(extra: String) {
        rootView.tv_extra.text = extra
    }
}
