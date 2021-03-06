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
package com.naver.android.svc.sample.tabs.common

import com.naver.android.svc.core.views.ActionViews
import com.naver.android.svc.sample.R
import kotlinx.android.synthetic.main.fragment_common.view.*

class CommonViews : ActionViews<CommonViewsAction>() {

    override val layoutResId = R.layout.fragment_common

    private val extra by lazy { rootView.tv_extra }
    private val name by lazy { rootView.tv_name }

    override fun onCreated() {
        extra.setOnClickListener { viewsAction.onClickExtra() }
        rootView.btn_click.setOnClickListener { viewsAction.onClickBtn() }
    }

    fun setNameText(name: String) {
        this.name.text = name
    }

    fun setExtraText(extraName: String) {
        this.extra.text = extraName
    }

    fun setButtonText(buttonText: String) {
        rootView.btn_click.text = buttonText
    }
}
