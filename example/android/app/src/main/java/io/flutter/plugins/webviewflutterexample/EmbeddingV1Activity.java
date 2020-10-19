// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package io.flutter.plugins.webviewflutterexample;

import android.os.Bundle;
//import dev.flutter.plugins.integration_test.IntegrationTestPlugin;

@SuppressWarnings("deprecation")
public class EmbeddingV1Activity extends io.flutter.app.FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
//    IntegrationTestPlugin.registerWith(
//        registrarFor("dev.flutter.plugins.integration_test.fork.IntegrationTestPlugin"));
    android.src.main.java.io.flutter.plugins.webviewflutter.fork.WebViewFlutterPlugin.registerWith(
        registrarFor("io.flutter.plugins.webviewflutter.fork.WebViewFlutterPlugin"));
  }
}
