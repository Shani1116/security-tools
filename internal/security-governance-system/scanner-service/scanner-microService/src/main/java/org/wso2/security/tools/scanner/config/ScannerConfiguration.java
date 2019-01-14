/*
 *  Copyright (c) 2018, WSO2 Inc., WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 *
 */

package org.wso2.security.tools.scanner.config;

/**
 * Class to represent the scanner configuration.
 */
public abstract class ScannerConfiguration implements Configuration {
    private String scannerClass;
    private String productPathForZipFileUpload;
    private String productPathForGitFileClone;

    @Override
    public void setScannerClass(String scannerClass) {
        this.scannerClass = scannerClass;
    }

    @Override
    public String getScannerClass() {
        return scannerClass;
    }

    @Override
    public void setProductPathForZipFileUpload(String productPath) {
        this.productPathForZipFileUpload = productPath;
    }

    @Override
    public void setProductPathForGitClone(String productPath) {
        this.productPathForGitFileClone = productPath;
    }

    @Override
    public String getProductPathForZipFileUpload() {
        return productPathForZipFileUpload;
    }

    @Override
    public String getProductPathForGitClone() {
        return productPathForGitFileClone;
    }

}