package RTC;


/**
* RTC/Fiducials.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class Fiducials implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// List of detected fiducials.
  public RTC.FiducialInfo fiducialsList[] = null;

  public Fiducials ()
  {
  } // ctor

  public Fiducials (RTC.Time _tm, RTC.FiducialInfo[] _fiducialsList)
  {
    tm = _tm;
    fiducialsList = _fiducialsList;
  } // ctor

} // class Fiducials
