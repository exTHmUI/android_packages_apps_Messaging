/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.messaging.ui;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;

import com.android.messaging.R;
import com.android.messaging.util.UiUtils;

import org.exthmui.settingslib.collapsingtoolbar.ExthmCollapsingToolbarBaseActivity;

public class LicenseActivity extends ExthmCollapsingToolbarBaseActivity {

    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.license_activity);
        Window window = getWindow();
        if (UiUtils.isDarkMode()){
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
        }else{
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        final WebView webView = findViewById(R.id.content);
        webView.loadUrl("file:///android_asset/licenses.html");
    }
}
