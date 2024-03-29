package del.gym.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.widget.ImageView;
import android.widget.Toast;

import del.gym.R;
import del.gym.ui.activity.NavigationLibraryActivity;

public class Utility {
    static String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+.+[a-z]+";
    private static ProgressDialog dialog;

    public static void loadImage(Context ctx, ImageView imageView, String url) {
        //Picasso.with(ctx).load(url).into(imageView);
    }

    /*public static void loadSpeakerImage(Context ctx, ImageView imageView, String url) {
        Picasso.with(ctx).load(url).placeholder(R.drawable.logo_hindi).error(R.drawable.logo_hindi).into(imageView);
    }*/

    public static void toastView(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }

    public static void setFragment(Fragment fragment, Context ctx, String tag) {
        ((NavigationLibraryActivity) ctx).getSupportFragmentManager().beginTransaction().replace(R.id.home_frame, fragment, tag).commit();
    }

    public static void showLoader(Context ctx) {
        dialog = new ProgressDialog(ctx);
        dialog.setCancelable(true);
        dialog.setMessage("loading..");
        dialog.show();
    }

    public static void hideLoader() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    public static boolean emailCheck(String email) {
        if (email.matches(emailPattern)) {
            return true;
        } else {
            return false;
        }
    }

    public static void shareApp(Context ctx) {
        try {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_SUBJECT, "Raktdoot");
            String sAux = "Checkout this application, Best App for find your nearest blood donors\n\n";
            sAux = sAux + "https://play.google.com/store/apps/details?id=" + ctx.getPackageName() + "\n\n";
            i.putExtra(Intent.EXTRA_TEXT, sAux);
            ctx.startActivity(Intent.createChooser(i, "Select one"));
        } catch (Exception e) {
            //e.toString();
        }
    }

    public static void rateUs(Context ctx) {
        Intent rateIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + ctx.getPackageName()));
        ctx.startActivity(rateIntent);
    }
}
