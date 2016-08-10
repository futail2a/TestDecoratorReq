package RTC;


/**
* RTC/MultiCameraImages.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class MultiCameraImages implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Image list.
  public RTC.CameraImage images[] = null;

  public MultiCameraImages ()
  {
  } // ctor

  public MultiCameraImages (RTC.Time _tm, RTC.CameraImage[] _images)
  {
    tm = _tm;
    images = _images;
  } // ctor

} // class MultiCameraImages
