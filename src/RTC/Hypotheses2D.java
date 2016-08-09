package RTC;


/**
* RTC/Hypotheses2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class Hypotheses2D implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// List of hypotheses.
  public RTC.Hypothesis2D hypotheses[] = null;

  public Hypotheses2D ()
  {
  } // ctor

  public Hypotheses2D (RTC.Time _tm, RTC.Hypothesis2D[] _hypotheses)
  {
    tm = _tm;
    hypotheses = _hypotheses;
  } // ctor

} // class Hypotheses2D
