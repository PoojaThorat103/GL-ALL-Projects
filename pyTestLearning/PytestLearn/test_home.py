import pytest



# FIXTURE

# @pytest.fixture
# def setup():
#     # tear up
#     print("Browser launch")
#     print("Log in")
#     yield
#     # tear down
#     print("Log off")
#     print("Browser close")

#NOTE : NO NEED TO WRITE FIXTURE CODE HERE IN THIS CLASS USE conftes.py

def testhome(setup):   # HERE SETUP  TEARUP WILL RUN BEFORE testhome  AND TEAR DOWN WILL RUN AFTER testhome
    print("user on Home page success")


def testclick(setup):
    print("remove item success")




