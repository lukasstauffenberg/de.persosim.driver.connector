package de.persosim.driver.test;

public class HandshakeData {
	private int lun;
	private boolean handshakeDone;

	/**
	 * @return the handshakeDone
	 */
	public boolean isHandshakeDone() {
		return handshakeDone;
	}
	/**
	 * @param handshakeDone the handshakeDone to set
	 */
	public void setHandshakeDone(boolean handshakeDone) {
		this.handshakeDone = handshakeDone;
	}
	/**
	 * @return the lun
	 */
	public int getLun() {
		return lun;
	}
	/**
	 * @param lun the lun to set
	 */
	public void setLun(int lun) {
		this.lun = lun;
	}
}