package RTC;


/**
* RTC/LimbState.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class LimbState implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Orientation, approach and position of the end-effector.
  public RTC.OAP oapMatrix = null;

  /// Current status of the limb.
  public RTC.LimbStatus status = null;

  public LimbState ()
  {
  } // ctor

  public LimbState (RTC.Time _tm, RTC.OAP _oapMatrix, RTC.LimbStatus _status)
  {
    tm = _tm;
    oapMatrix = _oapMatrix;
    status = _status;
  } // ctor

} // class LimbState
