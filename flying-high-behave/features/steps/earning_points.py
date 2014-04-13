from behave import *
import sys

from parse_type import TypeBuilder


@given(u'the flying distance between {departure} and {destination} is {distance} km')
def step_impl(context, departure, destination, distance):
    assert True

@given('I am a {status} Frequent Flyer member')
def step_impl(context, status):
    assert True

@when(u'I fly from Sydney to Melbourne')
def step_impl(context):
    assert True

@then(u'I should earn {points} points')
def step_impl(context, points):
    assert True


@when(u'I fly on a flight that is worth {points} base points')
def step_impl(context, points):
    assert True

@then(u'I should earn a status bonus of {earned}')
def step_impl(context, earned):
    assert True

@then(u'I should have guaranteed minimum earned points per trip of {minimum}')
def step_impl(context, minimum):
    assert True

@then(u'I should earn {total} points in all')
def step_impl(context, total):
    assert True


@given(u'{name} is a Frequent Flyer member')
def step_impl(context,name):
    assert True

@given(u'{name} logs in')
def step_impl(context,name):
    assert True


@given(u'a Frequent Flyer member {name} has logged in')
def step_impl(context,name):
    context.execute_steps(u"""
        Given {name} is a Frequent Flyer member
        And {name} logs in
    """)

@given(u'the following accounts')
def step_impl(context):
    for row in context.table:
        owner = row["owner"]
        points = row["points"]
        statusPoints = row["statusPoints"]

@when(u'Joe transfers 40000 points to Jill')
def step_impl(context):
    assert True

@then(u'the accounts should be the following')
def step_impl(context):
    assert True
