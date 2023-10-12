import pytest

# MARKEXPR
@pytest.mark.sanity
def testLogin():
    print("Login success")

@pytest.mark.skip
def testLoginOff():
    print("Logoff success")


@pytest.mark.xfail
def testCalculation():
    assert  2+2 == 4

