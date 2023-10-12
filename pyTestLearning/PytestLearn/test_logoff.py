import pytest


def testLogin():
    print("Login success")

@pytest.mark.sanity
def testLoginOff():
    print(" In logoff class : Logoff success")



def testCalculation():
    assert  2+2 == 4
