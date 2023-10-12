import pytest

# we can use fixture to pass inpute from cmd like (browser name)




@pytest.fixture(scope="session", autouse=True)
def setup(browser):
 # tear up
    if browser == "chrome" :
        print("Launch chrome")
    elif browser == "ff" :
        print("Launch FF")
    else:
        print("pass valid Browser")

    print("Browser launch")
    print("Log in")
    yield
    # tear down
    print("Log off")
    print("Browser close")

def pytest_addoption(parser): # will pass this browser (argument) and it should be recognise
    parser.addoption("--browser")

@pytest.fixture(scope="session", autouse=True)
def browser(request): # will return whatever value you are goint to provide against this perticular browser
    return request.config.getoption('--browser')

