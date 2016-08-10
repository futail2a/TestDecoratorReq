package RTC;


/**
* RTC/CameraImage.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class CameraImage implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Image pixel width.
  public short width = (short)0;

  /// Image pixel height.
  public short height = (short)0;

  /// Bits per pixel.
  public short bpp = (short)0;

  /// Image format (e.g. bitmap, jpeg, etc.).
  public String format = null;

  /// Scale factor for images, such as disparity maps, where the integer pixel value should be divided by this factor to get the real pixel value.
  public double fDiv = (double)0;

  /// Raw pixel data.
  public byte pixels[] = null;

  public CameraImage ()
  {
  } // ctor

  public CameraImage (RTC.Time _tm, short _width, short _height, short _bpp, String _format, double _fDiv, byte[] _pixels)
  {
    tm = _tm;
    width = _width;
    height = _height;
    bpp = _bpp;
    format = _format;
    fDiv = _fDiv;
    pixels = _pixels;
  } // ctor

} // class CameraImage
