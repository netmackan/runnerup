package org.runnerup.widget;

import android.content.Context;

import org.runnerup.R;

import com.google.android.gms.common.GooglePlayServicesUtil;

/**
 * Created by user on 4/4/15.
 */
public class AboutMapProvider {

    public CharSequence getAboutText(Context context) {
        return GooglePlayServicesUtil.getOpenSourceSoftwareLicenseInfo(context);
    }

}
