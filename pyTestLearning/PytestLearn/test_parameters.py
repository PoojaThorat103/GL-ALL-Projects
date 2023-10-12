import pytest

# Note :
# 1. we can do Parameterization through fixture
# 2. we can do Parameterization through Mark


@pytest.fixture(params=["a","b","c"])
def test_FixtureParameterizing(request):
    print(request.param)


def testlogin(test_FixtureParameterizing):
    print("Login")

#-----------------Parameterization through Mark

@pytest.mark.parametrize("a,b,addition",[(2,2,4),(3,2,5)])
def testaddition(a,b,addition):
     assert a+b == addition


