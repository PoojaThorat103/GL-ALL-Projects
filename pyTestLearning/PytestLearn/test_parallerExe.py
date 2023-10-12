from selenium import webdriver


def test_google():
 driver = webdriver.Chrome()
 driver.implicitly_wait(10)
 driver.get("https://www.google.com/")
 assert driver.title == "Google"
 print("------------------------------------------------------------------------")
 driver.quit()



def test_insta():
 driver = webdriver.Chrome()
 driver.implicitly_wait(10)
 driver.get("https://www.instagram.com/")
 assert driver.title == "Instagram"
 driver.quit()


def test_fac():
 driver = webdriver.Chrome()
 driver.implicitly_wait(10)
 driver.get("https://www.facebook.com/")
 driver.quit()
