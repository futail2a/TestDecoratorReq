package RTC;


/**
* RTC/Hypotheses3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class Hypotheses3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// List of hypotheses.
  public RTC.Hypothesis3D hypotheses[] = null;

  public Hypotheses3D ()
  {
  } // ctor

  public Hypotheses3D (RTC.Time _tm, RTC.Hypothesis3D[] _hypotheses)
  {
    tm = _tm;
    hypotheses = _hypotheses;
  } // ctor

} // class Hypotheses3D
