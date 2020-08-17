package com.uservoice.uservoicesdk.dialog;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public abstract class DialogFragmentBugfixed extends DialogFragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance())
            getDialog().setOnDismissListener(null);

        super.onDestroyView();
    }
}
