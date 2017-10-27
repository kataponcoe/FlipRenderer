package dreamcode.flip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;

public class GrabIt {
	private GrabIt() {
	}

	public static Bitmap takeScreenshot(View view) {
		assert view.getWidth() > 0 && view.getHeight() > 0;
		Bitmap.Config config = Bitmap.Config.ARGB_8888;
		Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
		Canvas canvas = new Canvas(bitmap);
		view.draw(canvas);

		return bitmap;
	}
}
