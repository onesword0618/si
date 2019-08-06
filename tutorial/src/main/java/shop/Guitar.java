package shop;

/**
 * ギタークラス<br>
 * 
 * <p>
 * 在庫にあるギターを表現しているクラス
 * </p>
 * 
 * @author onesword0618
 *
 */
public class Guitar extends Instrument {

	/**
	 * ギター仕様
	 */
	private GuitarSpec spec;

	/**
	 * コンストラクタ<br>
	 * 
	 * <p>
	 * 下記のパラメータを引数にしてギタークラスから、ギターオブジェクトを生成する.
	 * </p>
	 * 
	 * @param serialNumber シリアル番号
	 * @param price        値段
	 * @param spec         仕様
	 */
	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		// 継承先の呼び出し
		super(serialNumber, price, spec);
		this.spec = spec;
	}

	/**
	 * オブジェクトが保持しているギター仕様を提供する.
	 */
	@Override
	public GuitarSpec getSpec() {
		return spec;
	}

}
